Scala Plugin Highlighting Errors
===
Collection of examples of incorrect highlighting in IntellJ Idea's Scala plugin.
 
 
 
Example01
---

When imported definition conflicts with package name, 
for some reason package name takes precedence.

Example02
---

When trying to import a class parameter that shadows a field 
in parent class, such import is incorrectly reported as error.
