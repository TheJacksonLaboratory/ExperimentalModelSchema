.. _rststrain:

######
Strain
######

We currently have the following MPD schema for information about a strain. The table is mixing information about the
strain itself with information about its availability at JAX, which seems like it should live somewhere else? The
strain nomenclature and related concepts are available in this
`handbook <https://www.urmc.rochester.edu/MediaLibraries/URMCMedia/animal-resource/forms/documents/JAX-Handbook-Genetically-Standardized-Mice.pdf>`_,
but this information is not currently easily available at the JAX webpage.

**TODO** decide what level of detail we want to model this with and how.
Probably some sort of a strain ontology would be good so that all of the information about a strain lives externally
to the experimental packets and we can just use an ontology term to refer to them.

**TODO** Are there data required to denote the particular version of a strain used for some experiment?

.. code-block:: console


{
  "jaxinfo": [
    {
      "avl_status": "Repository Live",
      "nomenclature": "CC002/UncJ",
      "stocknum": "021236"
    }
  ],
  "mpdinfo": [
    {
      "aname": "CC002/UncJ",
      "id": 1502,
      "jaxavl": "Repository Live",
      "longname": "CC002/UncJ",
      "mginum": "MGI:5649080",
      "nproj": 9,
      "nsnpproj": null,
      "panelsym": "CC",
      "stocknum": "021236",
      "straintype": "RI",
      "vendor": "J"
    }
  ]
}