.. _rstexperimentalmodel:

#################
ExperimentalModel
#################

This element captures all the data about an individual animal model or about cohorts that
are represented as single observations, as is the case for many of the models in MPO.
The following example was generated with the current model using the ExperimentalModelTest.java class.


.. code-block:: console

    {
      "id": "where do we get this model id?",
      "animal": {
        "taxonomy": {
          "id": "NCBITaxon:10090",
          "label": "Mus musculus"
        },
        "strain": "B6.Cg-Tg(Myh6-Nox4)1Ams",
        "strainIdentifier": "MGI:4839003"
      },
      "study": {
        "id": "study.ID"
      },
      "phenotypicFeatureList": [{
        "type": {
          "id": "MP:0001544",
          "label": "abnormal cardiovascular system physiology"
        },
        "evidence": [{
          "evidenceCode": {
            "id": "ECO:0000033",
            "label": "author statement supported by traceable reference"
          },
          "reference": {
            "id": "PMID:20921387",
            "reference": "https://pubmed.ncbi.nlm.nih.gov/20921387/",
            "description": "NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis"
          }
        }]
      }, {
        "type": {
          "id": "MP:0002833",
          "label": "increased heart weight"
        },
        "evidence": [{
          "evidenceCode": {
            "id": "ECO:0000033",
            "label": "author statement supported by traceable reference"
          },
          "reference": {
            "id": "PMID:20921387",
            "reference": "https://pubmed.ncbi.nlm.nih.gov/20921387/",
            "description": "NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis"
          }
        }]
      }, {
        "type": {
          "id": "MP:0003915",
          "label": "increased left ventricle weight"
        },
        "evidence": [{
          "evidenceCode": {
            "id": "ECO:0000033",
            "label": "author statement supported by traceable reference"
          },
          "reference": {
            "id": "PMID:20921387",
            "reference": "https://pubmed.ncbi.nlm.nih.gov/20921387/",
            "description": "NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis"
          }
        }]
      }, {
        "type": {
          "id": "MP:0004486",
          "label": "decreased response of heart to induced stress"
        },
        "evidence": [{
          "evidenceCode": {
            "id": "ECO:0000033",
            "label": "author statement supported by traceable reference"
          },
          "reference": {
            "id": "PMID:20921387",
            "reference": "https://pubmed.ncbi.nlm.nih.gov/20921387/",
            "description": "NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis"
          }
        }]
      }, {
        "type": {
          "id": "MP:0010724",
          "label": "thick interventricular septum"
        },
        "evidence": [{
          "evidenceCode": {
            "id": "ECO:0000033",
            "label": "author statement supported by traceable reference"
          },
          "reference": {
            "id": "PMID:20921387",
            "reference": "https://pubmed.ncbi.nlm.nih.gov/20921387/",
            "description": "NADPH oxidase-4 mediates protection against chronic load-induced stress in mouse hearts by enhancing angiogenesis"
          }
        }]
      }],
      "genotypeList": [{
        "genotypeId": "MGI:4838552",
        "gene": {
          "id": "MGI:1354184",
          "label": "Nox4"
        },
        "genotypedescription": "Tg(Myh6-Nox4)1Ams",
        "genotypesymbol": "Tg(Myh6-Nox4)1Ams/0"
      }]
    }
