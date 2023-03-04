.. _rstemschema:

#########################
Experimental Model Schema
#########################

The Experimental Model Schema (EMS) is a semantic framework for
modeling the phenotypic data of model organism experimental data. The
EMS comprises information about the experimental conditions, genetic modifications
of the model, phenotypic observations and measurements. The EMS is
designed to be compatible with the
`GA4GH Phenopacket Schema <https://phenopacket-schema.readthedocs.io/en/latest/index.html>`_.

A goal of the EMS is to
represent experimental outcomes across the entirety of the
`Mouse Phenome Database <https://pubmed.ncbi.nlm.nih.gov/36330959/>`_ (MPD)
and to represent both individuals or experimental cohorts. The EMS is designed
to be flexible enough to represent experimental model data of other species.


Nomenclature
^^^^^^^^^^^^

We refer to the model as the *Experimental Model Schema*. We refer to
each instance of the EMS used to describe an experiment as a
*model packet* (lower case).



 .. list-table:: Definition of the ``ExperimentalModel`` element
    :widths: 25 25 25 75
    :header-rows: 1

    * - Field
      - Type
      - Multiplicity
      - Definition
    * - id
      - string
      - 1..1
      - arbitrary identifier. REQUIRED.
    * - subject
      - one of {:ref:`rstindividual` | :ref:`rstexperimentalcohort`}
      - 0..1
      - The proband. RECOMMENDED.
    * - phenotypic_features
      - List of :ref:`phenotypicfeature`
      - 0..*
      - Phenotypic features observed in the proband. RECOMMENDED.
    * - measurements
      - List of :ref:`rstmeasurement`
      - 0..*
      - Measurements performed in the proband
    * - experiments
      - List of :ref:`rstexperiments`
      - 0..*
      - Experimental procedures
    * - strain
      - :ref:`strain`
      - 1..1
      - species and strain of model organism
    * - genetic_mainuplation
      - List of :ref:`rstgeneticmanipulation`
      - 0..*
      - genetic modifications introduced to the model organism
    * - biosamples
      - List of :ref:`rstbiosample`
      - 0..*
      - samples (e.g., biopsies), if any
    * - files
      - List of :ref:`rstfile`
      - 0..*
      - list of files related to the subject, e.g. VCF or other high-throughput sequencing files
    * - meta_data
      - :ref:`rstmetadata`
      - 1..1
      - Information about ontologies and references used in the phenopacket. REQUIRED.



Explanations
############

id
~~

The id is an identifier specific for the experiment represented (the model packet).
The syntax of the identifier is application specific.


subject
~~~~~~~

This is typically the individual human (or another organism) that the Phenopacket is describing. In many cases, the individual will
be a patient or proband of the study. See :ref:`rstindividual` for further information.


phenotypic_features
~~~~~~~~~~~~~~~~~~~
This is a list of phenotypic findings observed in the subject. See :ref:`phenotypicfeature` for further information.


measurements
~~~~~~~~~~~~

A list of measurements performed in the patient. In contrast to :ref:`phenotypicfeature`, which
relies on an :ref:`rstontologyclass` to specify the observation, the :ref:`rstmeasurement` can
be used to report quanititative as well as ordinal or categorical measurements.



biosamples
~~~~~~~~~~

This field describes samples that have been derived from the patient who is the object of the Phenopacket.
or a collection of biosamples in isolation. See :ref:`rstbiosample` for further information.

interpretations
~~~~~~~~~~~~~~~

An optional list of :ref:`rstinterpretation` related to the phenopacket. These elements
are intended to represent interpretations of disease or phenotypic findings based on
genomic findings and must relate either to a genetic or genomic investigation of organismal
origin (e.g., germline DNA derived from a blood sample) or from a :ref:`rstbiosample`.


diseases
~~~~~~~~
This is a field for disease identifiers and can be used for listing either diagnosed or suspected conditions. The
resources using these fields should define what this represents in their context.
See :ref:`rstdisease` for further information.

medical_actions
~~~~~~~~~~~~~~~

A list of treatments or other medical actions performed for the person represented by this
phenopacket. See :ref:`rstmedicalaction` for details.


files
~~~~~
This element contains a list of pointers to relevant file(s) for the `subject`. For example, the results of a high-throughput
sequencing experiment. See :ref:`rstfile` for further information.


meta_data
~~~~~~~~
This element contains structured definitions of the resources and ontologies used within the phenopacket.
It is expected that every valid Phenopacket contains a metaData element.
See :ref:`rstmetadata` for further information.


