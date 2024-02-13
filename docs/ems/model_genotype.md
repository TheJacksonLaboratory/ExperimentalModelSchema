# ModelGenotype


For human data, we are using the `GA4GH Variation Representation Specification (VRS) <https://phenopacket-schema.readthedocs.io/en/latest/variant.html>`_.
However, mouse data often use symbolic representations of variants that are not immediately computable, for instance.


.. code-block:: console

    {
      "count": 1,
      "komp_genotypes": [
        {
          "genesymbol": "Slc1a3",
          "genotype_id": 1855703,
          "genotypedescription": "Slc1a3<tm1.1(KOMP)Mbp> -/+",
          "genotypesymbol": "-/+",
          "jr": 18557,
          "latest_pheno": "2013-04-05",
          "strainstatus": "KOMP Complete"
        }
      ]
    }

Question -- should we also support HGVS-style variants with the VRS framework?