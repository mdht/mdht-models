/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Hospital Discharge Diagnosis Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getHospitalDischargeDiagnosisSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis'"
 * @generated
 */
public interface HospitalDischargeDiagnosisSection
		extends
		org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis))'"
	 * @generated
	 */
	boolean validateMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and
	 * act.oclIsKindOf
	 * (consol::HospitalDischargeDiagnosis))->asSequence()->any(true
	 * ).oclAsType(consol::HospitalDischargeDiagnosis) <!-- end-model-doc -->
	 * 
	 * @model required="true" ordered="false" annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosis)'"
	 * @generated
	 */
	HospitalDischargeDiagnosis getmu2consolHospitalDischargeDiagnosis();

	/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
	public HospitalDischargeDiagnosisSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public HospitalDischargeDiagnosisSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // HospitalDischargeDiagnosisSection
