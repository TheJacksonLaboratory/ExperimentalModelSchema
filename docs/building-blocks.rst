.. _rstbuildingblocks:

===================
EMS building blocks
===================

The EMS standard consists of several protobuf messages each of which contains information about a certain topic such as phenotype,
variant, pedigree, and so on.  One message can contain other messages, which allows a rich representation of data.  For instance, the
Phenopacket message contains messages of type Individual, PhenotypicFeature, Biosample, and so on. Individual messages can therefore be regarded
as building blocks that are combined to create larger structures. It would also be straightforward to include the Phenopackets schema into
larger schema for particular use cases. Follow the links to read more information about individual
building blocks.



.. toctree::
   :maxdepth: 1

   age
   animal
   cohort_measurement
   individual
   experimental_cohort
   experimental_measurement
   metadata
   model_genotype
   ontologyclass
   project
   protocol
   researcher
   strain
   study
