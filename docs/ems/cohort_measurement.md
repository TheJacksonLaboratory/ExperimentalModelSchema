# CohortMeasurement


Some of our data is available as the aggregate measurements for a group of experimental animals.
An example is shown below. The implicit assumption is that the measurements are normally distributed **TODO** decide if
the EMS should commit to the assumption of Normality.






.. code-block:: console

    "strainmeans": [
        {
          "cv": 0.1963,
          "maxval": 3119.0,
          "mean": 2502.0,
          "measnum": 89013,
          "minval": 1782.0,
          "nmice": 8,
          "sd": 491.1,
          "sem": 173.6,
          "sex": "f",
          "strain": "CC002/UncJ",
          "strainid": 1502,
          "varname": "distance_total_OF",
          "zscore": -0.36
        },
        {
          "cv": 0.1071,
          "maxval": 4936.0,
          "mean": 4195.0,
          "measnum": 89013,
          "minval": 3821.0,
          "nmice": 5,
          "sd": 449.1,
          "sem": 200.8,
          "sex": "f",
          "strain": "CC003/UncJ",
          "strainid": 1503,
          "varname": "distance_total_OF",
          "zscore": 0.62
        },


Initial mapping

.. code-block:: console


    message CohortMeasurement {
      string id = 1;
      int32 number_of_animals = 2;
      OntologyClass strain = 3;
      OntologyClass assay = 4;
      Sex sex = 5;
      double mean = 6;
      double minimum_value = 7;
      double maximum_value = 8;
      double standard_deviation = 9;
      double standard_error_of_mean = 10;
      double zscore = 11;
    }