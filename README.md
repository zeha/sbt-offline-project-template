sbt sans internet
-----------------

Run `./builddeps.sh` while you have Internet, this will populate the `builddeps` folder (which you may want to check in into git).

Then run `./sbt` whenever you need to.


Most of this is just fighting against ivy, plus an sbt wrapper script.


Configuration
-------------

Source repositories are listed in `builddeps-ivysettings.xml`.

Packages to download are listed in `builddeps.xml`.


Dependencies
------------

You must have ivy and ant installed from somewhere (e.g. brew) for `./builddeps.sh` to work.
