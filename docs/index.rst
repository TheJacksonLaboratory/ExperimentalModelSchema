###############################################################
Welcome to the documentation for the experimental-model-schema!
###############################################################


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

The schema as well as source code in Java, C++, and Python
is available from the `experimental-model-schema GitHub repository <https://github.com/TheJacksonLaboratory/ExperimentalModelSchema>`_.

.. toctree::
   :maxdepth: 2
   :caption: Contents

   introduction
   experimental_model
   experimental_cohort
   building-blocks
   #recommended-ontologies
   #working
   #examples

