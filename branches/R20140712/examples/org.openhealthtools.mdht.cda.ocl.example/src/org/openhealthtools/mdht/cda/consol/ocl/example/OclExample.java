/*******************************************************************************
 * Copyright (c) 2012 smuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     smuir - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.cda.consol.ocl.example;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil.Query;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

public class OclExample {

	protected static final String GET_PROBLEMS_EOCL_EXP = "self.component.structuredBody.component.section.entry.act->select (act: cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct) )->asSequence()";

	protected static final String GET_CD_EOCL_EXP = "self.value->select(value : datatypes::ANY | not value.oclIsUndefined() and value.oclIsKindOf(datatypes::CD)).oclAsType(datatypes::CD)->asSequence()->first()";

	private static List<ProblemConcernAct> getProblemConcernAct(ClinicalDocument clinicalDocument) {
		try {
			Object o = CDAUtil.query(clinicalDocument, GET_PROBLEMS_EOCL_EXP);

			if (o instanceof ArrayList<?>) {
				return (ArrayList<ProblemConcernAct>) o;
			}

			return new ArrayList<ProblemConcernAct>();

		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<ProblemConcernAct>();
		}
	}

	private static CD getCodedValue(Observation observation) {
		try {
			Object o = CDAUtil.query(observation, GET_CD_EOCL_EXP);

			if (o instanceof CD) {
				return (CD) o;
			}

			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) throws Exception {

		CDAUtil.loadPackages();

		ClinicalDocument clinicalDocument = CDAUtil.load((new FileInputStream("samples/CCDSample.xml")));

		System.out.println("\nUsing CDAUtil OCL Support (for OCL gurus)");
		for (ProblemConcernAct act : getProblemConcernAct(clinicalDocument)) {
			for (ProblemObservation po : act.getProblemObservations()) {
				CD cd = getCodedValue(po);
				System.out.println(cd.getDisplayName());
			}
		}

		System.out.println("\nUsing CDAUtil Query/Filter Operations (programmatic access for Java gurus)");
		Query query = new Query(clinicalDocument);
		Section section = query.getSection(AdvanceDirectivesSection.class);
		System.out.println(section.getTitle().getText());
		List<AdvanceDirectiveObservation> observations = query.getClinicalStatements(AdvanceDirectiveObservation.class);
		for (AdvanceDirectiveObservation observation : observations) {
			CD cd = getCodedValue(observation);
			System.out.println(cd.getDisplayName());

		}

	}

}
