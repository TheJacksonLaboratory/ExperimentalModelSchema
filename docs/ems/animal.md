# Animal



Individual experimental animals are represented by the *Animal* element of the Experimental Model Schema.
This element intends to represent an individual model organism used in an experiment.
Note that some experiment packets will refer to a cohort of individual models used
for an experiment instead of an individual (See :ref:`rstexperimentalcohort`).



## Data model


| Field | Type | Multiplicity |  Description |
|:------|:-----------|:----------------|:------|
| id | string | 1..1 |  An arbitrary identifier. REQUIRED. |
| animal_identification_method_list |repeated AnimalIdentifier animal_identification_method_list  |0..* | Methods used to identify this mouse in the experiment  |
| sex | Sex | 1..1 |  Sex of the model organism |
| taxonomy | [OntologyClass](ontologyclass.md) | 1..1 | an :ref:`rstontologyclass` representing the species (e.g., NCBITaxon:10090 for Mus musculus)|
| strain | Strain | 0..1 |  an :ref:`rststrain` representing the strain|
| animalOrigin | AnimalOrigin | 0..1 | a  :ref:`rstanimal_origin`  representing the provence of the animal|






## Example


The following example represents a single male C57BL/A mouse with an ear punch with the value "90".


``` json
{
"animalIdentificationMethodList": [{
    "id": "arbitrary.id",
    "identifier": {
        "id": "MGI:1234567",
        "label": "ear punch"
    },
    "identifierValue": "90"
}],
    "sex": "MALE",
"taxonomy": {
    "id": "NCBITaxon:10090",
    "label": "Mus musculus"
},
"strain": {
    "strainType": {
        "id": "MGI:2670463",
        "label": "C57BL/A"
    },
    "strainAttribute": ["INBRED_STRAIN"]
},
"animalOrigin": {
    "vendor": "anonynmous_vendor",
    "externalIdentifier": "arbitrary.external.id",
    "originIdentifierList": [{
        "idType": "jr_number",
        "idValue": "424242"
            }]
    }
}
```




## Explanations



- animal_id

This element is the **primary** identifier for the individual animal and MUST be used in other parts of a message when
referring to this individual. There are no further constraints on the identifier, which is application-specific.

- animal_project_id

TODO -- DOES THIS REFER TO THE EXPERIMENT -- PROVIDE DEFINITION HERE


- project_symbol

TODO -- WHY IS THIS NEEDED IN ADDITION TO THE animal_project_id?

- sex

An enumeration to denote the phenotypic sex of the individual animal. See :ref:`rstsex`.

- stock_number

WHAT IS THIS FOR AND DOES IT BELONG IN THE SCHEMA?


- taxonomy


The taxonomy identifier of the species of the the animal MUST be provided at its most specific level. We advise using the
codes from the [NCBI Taxonomy](https://www.ncbi.nlm.nih.gov/taxonomy){:target="_blank"} resource. For instance,
NCBITaxon:10090 is mouse (Mus musculus) and  or NCBITaxon:9615 is dog.


- strain

TODO -- Decide how to represent this

- strain_identifier

TODO -- Decide how to represent this




