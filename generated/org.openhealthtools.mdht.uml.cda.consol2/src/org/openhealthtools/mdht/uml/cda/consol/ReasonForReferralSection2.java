/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reason For Referral Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getReasonForReferralSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ReasonForReferralSection2TemplateId ReasonForReferralSectionCode ReasonForReferralSectionCodeP' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.1' templateId.extension='2014-06-09' constraints.validation.dependOn.ReasonForReferralSectionCode='ReasonForReferralSectionCodeP' constraints.validation.info='ReasonForReferralSection2PatientReferralAct'"
 *        annotation="duplicates"
 * @generated
 */
public interface ReasonForReferralSection2 extends ReasonForReferralSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.3.1\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateReasonForReferralSection2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::PatientReferralAct))'"
	 * @generated
	 */
	boolean validateReasonForReferralSection2PatientReferralAct(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PatientReferralAct)).oclAsType(consol::PatientReferralAct)'"
	 * @generated
	 */
	EList<PatientReferralAct> getPatientReferralActs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection2 init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ReasonForReferralSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ReasonForReferralSection2
