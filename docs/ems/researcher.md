# Researcher



Information about a researcher involved in a project (MPD records this information as lists of **people**).
Uncertain if we want to include all of this information in the EMS


Here is an example
 .. code-block:: console

    "people":[
        {"address":"Madison, WI, USA",
        "affiliation":"University of Wisconsin",
        "comments":[],
        "email":"attie@biochem.wisc.edu",
        "fax":"",
        "firstName":"Alan",
        "lastName":"Attie",
        "midInitials":"D",
        "phone":"",
        "roles":[{"@id":"#role/1",
            "annotationValue":"investigator",
        "comments":[],
        "termAccession":"http://www.ebi.ac.uk/efo/EFO_0001739","termSource":"EFO"}]
        }, ...


## Data model


| Field | Type      | Multiplicity      |  Description                                                                          |
|:------|:----------|:------------------|:--------------------------------------------------------------------------------------|
|id| string| 1..1|An arbitrary identifier for this researcher (??). REQUIRED|
|firstName| string| 1..1|given name. REQUIRED|
|midInitials|string|0..1|Zero, one, or multiple middle initials. RECOMMENDED|
|lastName|string| 1..1|surname. REQUIRED|
|affiliation|string| 0..1|Should this be an object? What about people with multiple or changing affiliations, do we care?|
|address|string| 0..1| Address of the affiliation|
|comments| string| 0..1| free text
|fax|string|0..1|really?|
|email|string|0..1|do we really want to store emails here?|
|roles|list of [OntologyClass](ems/ontologyclass.md)| 0..*|roles such as investigator from EFO|



