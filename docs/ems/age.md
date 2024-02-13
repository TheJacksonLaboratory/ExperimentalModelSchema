# Age


TODO -- discuss what the appropriate way is to represent the age of mouse models. For a lot of human data,
we have used  `ISO8601 <https://en.wikipedia.org/wiki/ISO_8601>`_ duration or time intervals ( e.g. P40Y10M05D),
but this may not be what we want here. I am making the following suggestions


## Data model


| Field | Type | Multiplicity |  Description |
|:------|:-----|:-----|:-----|
| years | int32 |1..1 | Number of years. REQUIRED (may be zero).|
| weeks | int32 |1..1 | Number of weeks. REQUIRED (may be zero).|
| days | int32 |1..1 | Number of days. REQUIRED (may be zero).|



## AgeRange


Some of the age data is provided as ranges, e.g.,  "ageweeks": "7-9wks"

## Data model

| Field | Type | Multiplicity |  Description |
|:------:-----------|:----------------|:------|
| start | Age |  1..1 |  An Age message |
| end | Age |  1..1 |  An Age message |




## Example


For instance, to represent the "7-9wks", one could use an AgeRange object as follows..

.. code-block:: yaml

  ageRange:
    start:
        years: 0
        weeks: 7
        days: 0
    end:
        years: 0
        weeks: 9
        days: 0




