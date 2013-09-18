/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Discharge Medications Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHospitalDischargeMedicationsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HospitalDischargeMedicationsSectionTemplateId HospitalDischargeMedicationsSectionEntriesOptionalCode HospitalDischargeMedicationsSectionEntriesOptionalCodeP HospitalDischargeMedicationsSectionEntriesOptionalText HospitalDischargeMedicationsSectionEntriesOptionalTitle HospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication' templateId.root='2.16.840.1.113883.10.20.22.2.11.1' code.code='10183-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='HOSPITAL DISCHARGE MEDICATIONS' constraints.validation.dependOn.HospitalDischargeMedicationsSectionEntriesOptionalCode='HospitalDischargeMedicationsSectionEntriesOptionalCodeP'"
 * @generated
 */
public interface HospitalDischargeMedicationsSection extends HospitalDischargeMedicationsSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::DischargeMedication)).oclAsType(consol::DischargeMedication)'"
	 * @generated
	 */
	EList<DischargeMedication> getConsolDischargeMedications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HospitalDischargeMedicationsSection
