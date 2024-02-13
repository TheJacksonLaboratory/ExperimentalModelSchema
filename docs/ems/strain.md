# Strain


A **strain** can be defined as a group of organisms that belong to the same species but share certain genetic
characteristics not found in other members of the species (Source: `NCI <https://www.cancer.gov/publications/dictionaries/cancer-terms/def/organism-strain>`_).

Mouse strain nomenclature provides two types of technical information: the background or
parental strains upon which the strain is based, and details about relevant genes and alleles. The
strain name can also include such information as who developed the strain, where it was
developed, and where it is currently maintained (Details are available in the
`JAX Handbook <https://www.urmc.rochester.edu/MediaLibraries/URMCMedia/animal-resource/forms/documents/JAX-Handbook-Genetically-Standardized-Mice.pdf>`_).

The EPS represents strain information as follows.


## Data model


| Field | Type      | Multiplicity      |  Description                                                                          |
|:------|:----------|:------------------|:--------------------------------------------------------------------------------------|
|strain_type| OntologyClass| 1..1| ontology term representing the strain e.g., MP:0013414. REQUIRED.|
|strain_attribute|repeated StrainAttribute| 0..*, attributes of the strain. OPTIONAL|
|alternate_id_list|repeated string| 0..*| alternate string representations of the strain identified. OPTIONAL|

The *Strain* message is designed to work with an enumeration of strain attributes.

| Entry |    Explanation             |
|:------|:----------|
|UNKNOWN| no information available|
|INBRED_STRAIN| todo|
|CONGENIC| todo|
|MUTANT_STRAIN| todo|
|TRANSGENIC| todo|
|OUTBRED| todo|
|CRE_STRAIN| todo|


### Examples


The following represents the strain `"C57BL/A" <https://www.informatics.jax.org/strain/MGI:2670463>`_.

.. code-block:: console

    {
        "strainType": {
            "id": "MGI:2670463",
            "label": "C57BL/A"
        },
        "strainAttribute": ["INBRED_STRAIN"]
    }


The following represents the strain `"B6.Cg-Tg(Myh6-Nox4)1Ams " <https://www.informatics.jax.org/strain/MGI:4839003>`_/

.. code-block:: console

    {
        "strainType": {
            "id": "MGI:4839003",
            "label": "B6.Cg-Tg(Myh6-Nox4)1Ams"
        },
        "strainAttribute": ["CONGENIC", "MUTANT_STRAIN", "TRANSGENIC"]
    }


### Explanations


TODO -- explain how to choose each of the elements of this message (write this after we have finalized the element).
Also consider how this would be done for other models.


