.. _rstanimal_origin:

#################
Animal Identifier
#################

This element specifies identifiers used to track animals in cages or tanks etc.
This page provides an `introduction <https://www.jax.org/news-and-insights/2006/December/animal-identification-systems-used-for-mice>`_.
TODO -- better introduction.



Data model
##########

.. csv-table::
   :header: Field, Type, Multiplicity, Description

    id, string, 0..1, arbitrary identifier. OPTIONAL (or should this be required?).
    OntologyClass,identifier, 1..1, ontology term that describes the type of identifier such as ear punch or tattoo. REQUIRED
    identifier_value, string, 1..1, the value of the identifier. REQUIRED

The *AnimalIdentification* message is designed to be a component of the :ref:`rstanimal` message.


Example
^^^^^^^

Note that currently, we do not have an Ontology to refer to things such as ear punch or tattoo. It seems that it
would be useful to define a small ontology with these items, or to at least create MGI identifiers, since we do not
want to use strings for this (too easy to make a mistake), but an enumeration would inevitably not contain all of the
items that we will want to have. Therefore, for the purposes of this example, we have made up ``fake`` MGI terms to denote ear punch etc.

.. code-block:: console

    {
      "id": "arbitrary.id",
      "identifier": {
        "id": "MGI:1234567",
        "label": "ear punch"
      },
      "identifierValue": "90"
    }


Things to discuss
^^^^^^^^^^^^^^^^^

- Do we want to use an ontology to denote concepts such as Ear Punch?
- Is there a controlled vocabulary for the values, e.g., this `example <https://research.charlotte.edu/sites/research.charlotte.edu/files/media/files/iacuc/policies/Rodent-genotyping-SOP.pdf>`_ for each punch?
- Do we require any additional information?