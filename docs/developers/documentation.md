# Documentation

EMS documentation is done using mkdocs. To edit the documentation, first create a virtual environment and install the required packages.

```
python3 -m venv ems_venv
source bin ems_venv/bin/activate
pip install --upgrade pip
pip install mkdocs
pip install mkdocs-material
pip install mkdocs-material[imaging]
pip install mkdocs-material-extensions
pip install pillow cairosvg
pip install mkdocstrings[python]
```

then start a local server with
```
mkdocs serve
```