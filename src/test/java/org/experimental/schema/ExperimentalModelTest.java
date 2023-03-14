package org.experimental.schema;


import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.experimental.schema.core.Animal;
import org.experimental.schema.core.Evidence;
import org.experimental.schema.core.ExternalReference;
import org.experimental.schema.core.ModelGenotype;
import org.experimental.schema.core.OntologyClass;
import org.experimental.schema.core.PhenotypicFeature;
import org.experimental.schema.core.Sex;
import org.experimental.schema.core.Study;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Model this data
 * Allelic Composition	Allele Symbol(s)	Genetic Background	Mammalian Phenotype ID	PubMed ID	MGI Marker Accession ID (comma-delimited)
 * Tg(Myh6-Nox4)1Ams/0	Tg(Myh6-Nox4)1Ams	B6.Cg-Tg(Myh6-Nox4)1Ams	MP:0001544	20921387	MGI:4838550
 * Tg(Myh6-Nox4)1Ams/0	Tg(Myh6-Nox4)1Ams	B6.Cg-Tg(Myh6-Nox4)1Ams	MP:0002833	20921387	MGI:4838550
 * Tg(Myh6-Nox4)1Ams/0	Tg(Myh6-Nox4)1Ams	B6.Cg-Tg(Myh6-Nox4)1Ams	MP:0003915	20921387	MGI:4838550
 * Tg(Myh6-Nox4)1Ams/0	Tg(Myh6-Nox4)1Ams	B6.Cg-Tg(Myh6-Nox4)1Ams	MP:0004486	20921387	MGI:4838550
 * Tg(Myh6-Nox4)1Ams/0	Tg(Myh6-Nox4)1Ams	B6.Cg-Tg(Myh6-Nox4)1Ams	MP:0010724	20921387	MGI:4838550
 */
public class ExperimentalModelTest {


    private static org.experimental.schema.ExperimentalModel model;

    private static ModelGenotype modelGenotype() {
        // Tg(Myh6-Nox4)1Ams/0
        //Nox4
        OntologyClass nox4 = OntologyClass.newBuilder()
                .setId("MGI:1354184")
                .setLabel("Nox4")
                .build();
        ModelGenotype genotype = ModelGenotype.newBuilder()
                .setGene(nox4)
                .setGenotypeId("MGI:4838552")
                .setGenotypedescription("Tg(Myh6-Nox4)1Ams")
                .setGenotypesymbol("Tg(Myh6-Nox4)1Ams/0" ) // our model appears to be heterozygouys
                .build();
        return genotype;
    }

    private static Animal animal() {
        /*
  string animal_id = 1;
  string animal_project_id = 2;
  string project_symbol = 3;
  Sex sex = 4;
  int32 stock_number = 5;
  OntologyClass taxonomy = 6;
  string strain = 7;
  string strain_identifier = 8;
         */
        OntologyClass mmusculus = OntologyClass.newBuilder()
                .setId("NCBITaxon:10090")
                .setLabel("Mus musculus")
                .build();
        Animal animal = Animal.newBuilder()
                .setTaxonomy(mmusculus)
                .setSex(Sex.UNKNOWN_SEX)
                //.setStrain("B6.Cg-Tg(Myh6-Nox4)1Ams")
                //.setStrainIdentifier("MGI:4839003") // This is a string in MPD but a CURIE here -- UNIFY!
                .build();
        return animal;
    }


    private static PhenotypicFeature phenotypicFeature(String id, String label) {

        ExternalReference externalReference = ExternalReference.newBuilder()
                .setId("PMID:20921387")
                .setReference("https://pubmed.ncbi.nlm.nih.gov/20921387/")
                .setDescription("NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis")
                .build();
        OntologyClass evidenceCode = OntologyClass.newBuilder()
                .setId("ECO:0000033")
                .setLabel("author statement supported by traceable reference")
                .build();
        Evidence evidence = Evidence.newBuilder()
                .setEvidenceCode(evidenceCode)
                .setReference(externalReference)
                .build();
        OntologyClass clz = OntologyClass.newBuilder()
                .setId(id)
                .setLabel(label)
                .build();
        PhenotypicFeature pf = PhenotypicFeature.newBuilder()
                .setType(clz)
                .addEvidence(evidence)
                .build();
        return pf;
    }

    private static List<org.experimental.schema.core.PhenotypicFeature> phenotypicFeatureList() {
        List<PhenotypicFeature> features = new ArrayList<>();
        features.add(phenotypicFeature("MP:0001544", "abnormal cardiovascular system physiology"));
        features.add(phenotypicFeature("MP:0002833", "increased heart weight"));
        features.add(phenotypicFeature("MP:0003915", "increased left ventricle weight"));
        features.add(phenotypicFeature("MP:0004486", "decreased response of heart to induced stress"));
        features.add(phenotypicFeature("MP:0010724", "thick interventricular septum"));
        return features;
    }

    private static Study study() {
        Study study = Study.newBuilder()
                .setId("study.ID")
                .build();
        return study;
    }


    @BeforeAll
    public static void init() {
        String id ="where do we get this model id?";
        model = org.experimental.schema.ExperimentalModel.newBuilder()
                .setId(id)
                .setStudy(study())
                .setAnimal(animal())
                .addAllPhenotypicFeatureList(phenotypicFeatureList())
                .addGenotypeList(modelGenotype())
                .build();

    }

    @Test
    public void testConvertToJson() throws InvalidProtocolBufferException {
        String json = JsonFormat.printer().print(model);
        System.out.println(json);
        org.experimental.schema.ExperimentalModel.Builder animalBuilder = org.experimental.schema.ExperimentalModel.newBuilder();
        JsonFormat.parser().merge(json, animalBuilder);
        org.experimental.schema.ExperimentalModel fromJson = animalBuilder.build();
        //Ta-da!
        assertNotNull(json);

    }


}
