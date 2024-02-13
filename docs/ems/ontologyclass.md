# OntologyClass


This element is used to represent classes (terms) from ontologies, and is used in many places throughout the
Phenopacket standard. It is a simple, two element message that represents the identifier and the label of
an ontology class.



## Data model


| Field | Type      | Multiplicity      |  Description                                                                          |
|:------|:----------|:------------------|:--------------------------------------------------------------------------------------|
| id    |  string   |  1..1             |  a CURIE-style identifier e.g., MP:0013414. REQUIRED                                  |
| label |  string   |  1..1             | human-readable class name e.g., decreased myeloid cell number in bone marrow. REQUIRED|


## Example



``` yaml
ontologyClass:
    id: "MP:0013414"
    label: "decreased myeloid cell number in bone marrow"
```

## Explanations



- id

The ID SHALL be a CURIE-style identifier, e.g., HP:0100024, MP:0001284, UBERON:0001690.
In order that the class is resolvable, it MUST reference the namespace prefix of a :ref:`rstresource` named in the
[MetaData](metadata.md) message.




- label

The the human-readable label for the concept. This MUST match the ID in the ontology referenced by the namespace prefix
in a :ref:`rstresource` named in the [MetaData](metadata.md).
