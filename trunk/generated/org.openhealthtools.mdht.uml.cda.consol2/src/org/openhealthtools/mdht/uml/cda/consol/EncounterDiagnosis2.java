/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Diagnosis2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getEncounterDiagnosis2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='EncounterDiagnosisTemplateId EncounterDiagnosisCode EncounterDiagnosisCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.80.2' code.code='29308-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Diagnosis' constraints.validation.dependOn.EncounterDiagnosisCode='EncounterDiagnosisCodeP'"
 * @generated
 */
public interface EncounterDiagnosis2 extends EncounterDiagnosis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterDiagnosis2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterDiagnosis2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // EncounterDiagnosis2
