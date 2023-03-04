.. _rstproject:

#######
Project
#######

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




