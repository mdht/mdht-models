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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Postprocedure Diagnosis Section</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getPostprocedureDiagnosisSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolPostprocedureDiagnosisSectionTemplateId Mu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis' templateId.root='2.16.840.1.113883.10.20.22.2.36'"
 * @generated
 */
public interface PostprocedureDiagnosisSection extends
		org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and
	 * entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))
	 * 
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @model annotation=
	 *        "http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PostprocedureDiagnosis))'"
	 * @generated
	 */
	boolean validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosis)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PostprocedureDiagnosis))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosis)'"
	 * @generated
	 */
	PostprocedureDiagnosis getMu2consolPostprocedureDiagnosis();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection init();

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public PostprocedureDiagnosisSection init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // PostprocedureDiagnosisSection
