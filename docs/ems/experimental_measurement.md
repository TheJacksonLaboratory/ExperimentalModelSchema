# Experimental Measurement


The subject of the Experimental Model Schema is represented by an *Individual* element.
This element intends to represent an individual model organism used in an experiment.
Note that some experiment packets will refer to a cohort of individual models used
for an experiment instead of an individual (See :ref:`rstexperimentalcohort`).

Probably we want to model this on the ro-crate JSON-LD model, therefore I am not trying to fill out details here


## Suggestion


The data that is current in MPD looks like this

.. code-block:: console

    "animaldata": [
    {
      "animal_id": "F148-1-dob2015-01-09",
      "animal_projid": 519,
      "measnum": 89013,
      "projsym": "JaxCC1",
      "sex": "f",
      "stocknum": "021236",
      "strain": "CC002/UncJ",
      "strainid": 1502,
      "value": 2117.0,
      "varname": "distance_total_OF",
      "zscore": -0.78
    },
    {
      "animal_id": "F148-2-dob2015-01-09",
      "animal_projid": 519,
      "measnum": 89013,
      "projsym": "JaxCC1",
      "sex": "f",
      "stocknum": "021236",
      "strain": "CC002/UncJ",
      "strainid": 1502,
      "value": 2887.0,
      "varname": "distance_total_OF",
      "zscore": 0.78
    }, ....

and like this

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
that these experimental designs are stable with time.

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

In bioconnect, I am seeing things like this -- JAXAS000001
longitudinal mass measurement assay, but it is unclear where to get info about *JAXAS000001* -- is this intended to
be a controlled terminology or ontology?

## Data model


| Field | Type | Multiplicity |  Description |
|id | string |1..1|An arbitrary identifier for this specific measurement. REQUIRED|
|assay | [OntologyClass](ontologyclass.md) | 1..1 |The experiment performed to obtain the measurement|
|age |AgeElement| 0..1|The age at which the experiment was performend. RECOMMENDED|


## Example


The following example is typical but does not make use of all of the optional fields of this element.

.. code-block:: yaml

  todo:
    id: "todo"


## Explanations

todo

