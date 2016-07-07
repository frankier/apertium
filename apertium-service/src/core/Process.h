/**
 * @file
 * @author  Pasquale Minervini <p.minervini@gmail.com>
 * @version 1.0
 *
 * @section LICENSE
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @section DESCRIPTION
 *
 * The class Translate is used to execute the sequence of step required by
 * a translation task by using the informations contained in Modes files.
 */

#ifndef PROCESS_H_
#define PROCESS_H_

#include <iostream>
#include <fstream>
#include <sstream>

#include <string>
#include <vector>

#include <boost/process.hpp>

class Process {
public:
	Process(std::string, std::vector<std::string>);
	~Process();

	std::ostream& in();
	std::istream& out();

private:
	boost::process::child *p;
};

#endif /* PROCESS_H_ */
