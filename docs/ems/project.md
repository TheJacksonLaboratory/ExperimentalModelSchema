# Project


A project comprises multiple studies, generally on the same topic. **TODO** Describe what a project is and how it relates to Study!


Data model
##########

 .. list-table:: Definition of the ``ExperimentalMeasurement`` element
    :widths: 25 25 25 75
    :header-rows: 1

    * - Field
      - Type
      - Multiplicity
      - Description
    * - id
      - string
      - 1..1
      - An arbitrary identifier for this project. REQUIRED
    * - people
      - ??
      - 1..*
      - List of people involved in the project ??
    * - publicReleaseDate
      - ?? Date or timestamp
      - 0..1
      - The age at which the experiment was performend. RECOMMENDED
    * - publications
      - ?? Publication object
      - 0..*
      - Publications that describe this project.
    * - studies
      - :ref:`study`_
      - 0..*
      - specific studies performed for this project
    * - metadata
      - :ref:`rstmetadata`
      - 0..*
      - Ontology versions used to create the ES


The following is the data available in MPD for a project:

.. code-block:: console

    {
      "count": 1,
      "projects": [
        {
          "ages": "various",
          "availstat": "public",
          "changesincereleased": null,
          "corrpi": null,
          "createdtime": null,
          "deletedtime": null,
          "external_id": null,
          "instauth": "instauth",
          "largecollab": null,
          "mpdsector": "pheno",
          "ncohorts": null,
          "nstrains": 18,
          "paneldesc": "CC",
          "panelsym": "CC",
          "participants": null,
          "pistring": "The Jackson Laboratory",
          "popcount_f": null,
          "popcount_m": null,
          "pophints": null,
          "projid": 519,
          "projsym": "JaxCC1",
          "projyear": "2018",
          "releasedate": "2019/04",
          "releasedtime": null,
          "rnaseq_id": null,
          "seriesstub": null,
          "seriestag": null,
          "sexes": "both",
          "species": null,
          "status": null,
          "tags": "",
          "title": "Multisystem phenotyping of 18 Collaborative Cross strains",
          "updatedtime": null,
          "url": null
        }
      ]
    }
