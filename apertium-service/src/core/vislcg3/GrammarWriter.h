/*
* Copyright (C) 2007-2010, GrammarSoft ApS
* Developed by Tino Didriksen <tino@didriksen.cc>
* Design by Eckhard Bick <eckhard.bick@mail.dk>, Tino Didriksen <tino@didriksen.cc>
*
* This file is part of VISL CG-3
*
* VISL CG-3 is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* VISL CG-3 is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with VISL CG-3.  If not, see <http://www.gnu.org/licenses/>.
*/

#pragma once
#ifndef __GRAMMARWRITER_H
#define __GRAMMARWRITER_H

#include "stdafx.h"
 
namespace CG3 {
	class Grammar;
	class Tag;
	class Set;
	class Rule;
	class ContextualTest;

	class GrammarWriter {
	public:
		bool statistics;
	
		GrammarWriter(Grammar &res, UFILE *ux_err);
		~GrammarWriter();

		int writeGrammar(UFILE *output);

	private:
		UFILE *ux_stderr;
		uint32HashSet used_sets;
		const Grammar *grammar;

		void printTag(UFILE *out, const Tag &tag);
		void printSet(UFILE *output, const Set &curset);
		void printRule(UFILE *to, const Rule &rule);
		void printContextualTest(UFILE *to, const ContextualTest &test);
	};
}

#endif
