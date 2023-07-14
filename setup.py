import os
import xmltodict

from setuptools import setup, find_packages

path = os.path.dirname(os.path.abspath(__file__))

with open(os.path.join(path, 'README.rst')) as f:
    READ_ME = f.read()

with open(os.path.join(path, 'requirements.txt')) as f:
    REQUIREMENTS = f.read().splitlines()


def version():
    with open(os.path.join(path, 'pom.xml')) as f:
        pom = xmltodict.parse(f.read())
        return pom['project']['version']

setup(
      name='ems_phenopackets',
      version='0.0.4',  # version(),  # replace with version method
      packages=find_packages(),
      install_requires=REQUIREMENTS,
      package_data={'':  ['tests/*']},
      data_files=[('', ['requirements.txt', 'LICENSE'])],
      test_suite="tests",
      long_description=READ_ME,
      long_description_content_type='text/x-rst',
      author='Peter N. Robinson',
      author_email='peter.robinson@jax.com',
      url='https://github.com/TheJacksonLaboratory/ExperimentalModelSchema',
      description='A python implementation of EMS phenopackets',
      license='BSD',
      keywords='phenopackets, experimental'
      )
