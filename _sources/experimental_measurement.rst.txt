.. _rstexperimental_measurement:

#########################
Experimental Measaurement
#########################

The subject of the Experimental Model Schema is represented by an *Individual* element.
This element intends to represent an individual model organism used in an experiment.
Note that some experiment packets will refer to a cohort of individual models used
for an experiment instead of an individual (See :ref:`rstexperimentalcohort`).


Suggestion
##########

The data that is current in MPD looks like this

.. code-block:: console

    measures_info": [
        {
          "ageweeks": "7-9wks",
          "association": null,
          "datatype": null,
          "descrip": "total distance traveled, 20 min test",
          "descrip2": null,
          "extname": "distance_traveled_total",
          "file_column": null,
          "granularity": "animal",
          "intervention": null,
          "is_baseline": false,
          "is_control": false,
          "is_covar": null,
          "is_measure": true,
          "keymeasnum": 89013,
          "label": null,
          "listorder": 9013,
          "magnitude": null,
          "measnum": 89013,
          "method": "open field test",
          "mpdsector": "css",
          "native_method": "open field",
          "nstrainstested": 18,
          "paneldesc": "CC",
          "private": null,
          "projsym": "JaxCC1",
          "projyear": "2018",
          "reference": null,
          "seriestype": null,
          "sextested": "both",
          "sourceparm": "jaxcc_oft",
          "supplemental": null,
          "units": "cm",
          "upload_factors": null,
          "varname": "distance_total_OF"
        }
      ]

It seems to me that this is mixing information about the experiment itself with information about the measurement
and other items. We would want to "normalize" this in database parlance. It seems to me it would be a good idea
to create an ontology to represent information about the types of experiments we perform at JAX under the assumption
that these experimental desgns are stable with time.

We have here an **Open Field Test**: The Open Field task is a simple sensorimotor test used to determine general activity
levels, gross locomotor activity, and exploration habits in rodent models.

We could represent this as follows

.. code-block:: console

    id: MEO:0000001
    label: open-field test total distance traveled

    id: MEO:0000002
    label: open-field test total distance traveled in 10 minutes
    is_a: MEO:0000001 ! open-field test total distance traveled

    id: MEO:0000002
    label: open-field test total distance traveled in 20 minutes
    is_a: MEO:0000001 ! open-field test total distance traveled

Then, we would refer to this term instead of the  descrip, descrip2, extname, measnum, and method fields (and possibly some of the
other fields) in the EMS.

Data model
##########

 .. list-table::
    :widths: 25 25 25 75
    :header-rows: 1

    * - Field
      - Type
      - Multiplicity
      - Description
    * - id
      - string
      - 1..1
      - An arbitrary identifier. REQUIRED.
    * - alternate_ids
      - a list of :ref:`rstcurie`
      - 0..*
      - A list of alternative identifiers for the individual
    * - date_of_birth
      - timestamp
      - 0..1
      - A timestamp either exact or imprecise
    * - time_at_last_encounter
      - :ref:`rsttimeelement`
      - 0..1
      - The age or age range of the individual when last encountered. RECOMMENDED.
    * - vital_status
      - :ref:`rstvitalstatus`
      - 0..1
      - The vital status of the individual e.g. whether they are alive or the time and cause of death. RECOMMENDED.
    * - sex
      - :ref:`rstsex`
      - 0..1
      - Observed apparent sex of the individual
    * - karyotypic_sex
      - :ref:`rstkaryotypicsex`
      - 0..1
      - The karyotypic sex of the individual
    * - gender
      - :ref:`rstkaryotypicsex`
      - 0..1
      -  Self-identified gender
    * - taxonomy
      - :ref:`rstontologyclass`
      - 0..1
      - an :ref:`rstontologyclass` representing the species (e.g., NCBITaxon:9615)


Example
#######

The following example is typical but does not make use of all of the optional fields of this element.

.. code-block:: yaml

  individual:
    id: "patient:0"
    dateOfBirth: "1998-01-01T00:00:00Z"
    sex: "MALE"

Explanations
############

id
~~
This element is the **primary** identifier for the individual and SHOULD be used in other parts of a message when
referring to this individual - for example in a :ref:`rstpedigree` or :ref:`rstbiosample`. The contents of the element
are context dependent, and will be determined by the application. For instance, if the Phenopacket is being used to
represent a case study about an individual with some genetic disease, the individual may be referred to in that study by
their position in the pedigree, e.g., III:2 for the second person in the third generation. In this case, id would be set
to ``III:2``.