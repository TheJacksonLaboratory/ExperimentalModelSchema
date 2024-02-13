# Animal Origin


These elements specify the source of an animal (vendor).


The *AnimalOrigin* message is designed to be a component of the [animal](animal.md) message.

## Data model


Two messages are used. The animal origin identifier represents institution-specific identifier codes, such as the
JR number at JAX.
TODO -- explain this better!
TODO -- this is extremely prelimiary and only intended to start discussions!


| Field | Type | Multiplicity |  Description |
|:------|:-----------|:----------------|:------|
| id_type |  string|  1..1|  arbitrary identifier. REQUIRED |
| id_value|  string|  1..1|  the value of the identifier. REQUIRED|

The AnimalOrigin message has a list of AnimalOriginIdentifiers and also specifies the vender and an external identifier of the vendor.


| Field | Type | Multiplicity |  Description |
| ivendor | i string| i 1..1| i arbitrary identifier. REQUIRED| i
| external_identifier|  string |  1..1|  the value of the identifier. REQUIRED|
| origin_identifier_list |  repeated AnimalOriginIdentifier |  0..*, OPTIONAL|

### Example


Here is a simple example to get discussions started...
What about stock number?

``` json
{
  "vendor": "anonynmous_vendor",
  "externalIdentifier": "arbitrary.external.id",
  "originIdentifierList": [{
    "idType": "jr_number",
    "idValue": "424242"
  }]
}
```
