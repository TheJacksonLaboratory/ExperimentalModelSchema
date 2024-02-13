# EMS building blocks


The EMS standard consists of several protobuf messages each of which contains information about a certain topic such as phenotype,
variant, pedigree, and so on.  One message can contain other messages, which allows a rich representation of data.  For instance, the
Phenopacket message contains messages of type Individual, PhenotypicFeature, Biosample, and so on. Individual messages can therefore be regarded
as building blocks that are combined to create larger structures. It would also be straightforward to include the Phenopackets schema into
larger schema for particular use cases. Follow the links to read more information about individual
building blocks.



- [age](ems/age.md)
- [animal](ems/animal.md)
- [animal_identifier](ems/animal_identifier.md)
- [animal_origin](ems/animal_origin.md)
- [cohort_measurement](ems/cohort_measurement.md)
- [experimental_cohort](ems/experimental_cohort.md)
- [experimental_measurement](experimental_measurement/age.md)
- [metadata](ems/metadata.md)
- [model_genotype](ems/model_genotype.md)
- [ontologyclass](ems/ontologyclass.md)
- [project](ems/age.project)
- [protocol](ems/protocol.md)
- [researcher](ems/researcher.md)
- [strain](ems/strain.md)
- [study](ems/study.md)














