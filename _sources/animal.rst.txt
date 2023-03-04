.. _rstanimal:

######
Animal
######

Individual experimental animals are represented by the *Animal* element of the Experimental Model Schema.
This element intends to represent an individual model organism used in an experiment.
Note that some experiment packets will refer to a cohort of individual models used
for an experiment instead of an individual (See :ref:`rstexperimentalcohort`).



Data model
##########

 .. list-table::
    :widths: 25 25 25 75
    :header-rows: 1

    * - Field
      - Type
      - Multiplicity
      - Description
    * - animal_id
      - string
      - 1..1
      - An arbitrary identifier. REQUIRED.
    * - animal_project_id
      - string
      - 0..1
      - An arbitrary identifier for the experimental project
    * - project_symbol
      - string
      - 0..1
      - An arbitrary symbol/acronym for the experimental project
    * - sex
      - :ref:`rstsex`
      - 1..1
      - Sex of the model organism
    * - stock_number
      - :ref:`rstkaryotypicsex`
      - 0..1
      - WHAT IS THIS
    * - taxonomy
      - :ref:`rstontologyclass`
      - 1..1
      - an :ref:`rstontologyclass` representing the species (e.g., NCBITaxon:10090 for Mus musculus)
    * - strain
      - string
      - 0..1
      - an string representing the strain TODO DO WE WANT TO MODEL THE STRAIN IN DETAIL?
   * - strain_identifier
      - string
      - 0..1
      - a identifier representing the strain TODO DO WE ALSO NEED THIS HERE

Example
#######

The following example represents a single male CC002/UncJ mouse that is being used for the JaxCC1 project.
TODO -- Any other introduction needed here?

.. code-block:: yaml

  animal:
    animal_id: "F148-1-dob2015-01-09"
    animal_project_id: "519"
    project_symbol: "JaxCC1"
    sex: "MALE"
    stock_number: 42
    taxonomy:
        id: "NCBITaxon:10090"
        label: "Mus musculus"
    strain: "CC002/UncJ",
    strain_identifier: 1502

Alternatively in JSON,

.. code-block:: json

    {
      "animalId": "F148-1-dob2015-01-09",
      "animalProjectId": "519",
      "projectSymbol": "JaxCC1",
      "sex": "MALE",
      "stockNumber": 42,
      "taxonomy": {
        "id": "NCBITaxon:10090",
        "label": "Mus musculus"
      },
      "strain": "CC002/UncJ",
      "strainIdentifier": "1502"
    }



Explanations
############


animal_id
^^^^^^^^^
This element is the **primary** identifier for the individual animal and MUST be used in other parts of a message when
referring to this individual. There are no further constraints on the identifier, which is application-specific.

animal_project_id
^^^^^^^^^^^^^^^^^
TODO -- DOES THIS REFER TO THE EXPERIMENT -- PROVIDE DEFINITION HERE


project_symbol
^^^^^^^^^^^^^^
TODO -- WHY IS THIS NEEDED IN ADDITION TO THE animal_project_id?

sex
^^^
An enumeration to denote the phenotypic sex of the individual animal. See :ref:`rstsex`.

stock_number
^^^^^^^^^^^^
WHAT IS THIS FOR AND DOES IT BELONG IN THE SCHEMA?


taxonomy
~~~~~~~~
The taxonomy identifier of the species of the the animal MUST be provided at its most specific level. We advise using the
codes from the `NCBI Taxonomy <https://www.ncbi.nlm.nih.gov/taxonomy>`_ resource. For instance,
NCBITaxon:10090 is mouse (Mus musculus) and  or NCBITaxon:9615 is dog.


strain
^^^^^^
TODO -- Decide how to represent this

strain_identifier
^^^^^^^^^^^^^^^^^
TODO -- Decide how to represent this




