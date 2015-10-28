= Periodic Table Testing Exercise

*Warning:* This code contains bugs. The exercise is to design a test plan and find the bugs.

== Brief

We are building an educational software package that models the [periodic table of the elements](https://en.wikipedia.org/wiki/Periodic_table) and can display some simple chemical compounds. For this, we've built a `ChemicalElement` class. It needs to be tested.

The periodic table of chemical elements classifies and displays all chemical elements.
Each chemical element has a unique symbolic name and atomic number (number of protons).
Chemical elements are grouped together by common characteristics (alkali metal, transition metal, ...) called the chemical series.

Examples of chemical elements:
- H: Hydrogen with atomic number 1.
- O: Oxygen with atomic number 8.
- K: Potassium with atomic number 19. It is an alkali metal.
- Zn: Zinc (from german Zink) with atomic number 30. It is a transition metal.
- Ga: Gallium with atomic number 31. It is a metal.

We need to be able to model the following chemical series:

- Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87.
- Transition metals are all chemical elements with atomic number from 21 to 31, 39 to 48, 72 to 80, and 104 to 112.
- Metals are all chemical elements with atomic number 13, 49, 50, 81, 82, 83, 113, 114, 115, or 116.

There are several ways to order chemical elements in a formula. One is used to write structural formula of chemical compounds (H2O, NaCl): the elements are ordered according their electronegativity (in ascending order).

Another ordering is the Hill system: Carbon (C) always is indicated first, then H (if it exists in the molecule). All other elements are given in lexicographical order.
If no Carbon exists, then all elements (including H) are given in lexicographical order.

For instance: ClNa instead NaCl.

We need to be able to order chemical formulas using either system.

== Credits

This exercise is based on http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/objects.html#chemical_element