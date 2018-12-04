Use case (http://x-stream.github.io/CVE-2013-7285.html)
--------
Inject code to open an external calculator app while deserializing into java collection sets that uses Comparable interface.

Fix
---
It breaches app security to open the calculator until v1.4.6. From v1.4.7 till v1.4.9, it throws an exception saying
there is no Converter available for java.beans.EventHandler. Actually this was the fix XStream introduced in v1.4.7 to prevent the issue.
Issue again started showing up with v1.4.10 which is fixed with v1.4.10.



