import os
import unittest

from google.protobuf.json_format import Parse, MessageToJson
#from google.protobuf.timestamp_pb2 import Timestamp

#from experimental.schema.core import

#from phenopackets.schema.core import Animal
#from phenopackets import Individual, Sex, PhenotypicFeature, OntologyClass, Phenopacket

class PhenopacketsTest(unittest.TestCase):

    def test_phenopacket_round_trip(self):
        self.assertEqual(1, 1)


if __name__ == '__main__':
    unittest.main()