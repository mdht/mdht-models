/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;

import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection#validateCodedSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection#getIHESocialHistoryObservations() <em>Get IHE Social History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedSocialHistorySectionOperations extends SocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedSocialHistorySectionSocialHistoryObservation(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Social History Section Social History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSocialHistorySectionSocialHistoryObservation(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ccd::SocialHistoryObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedSocialHistorySectionSocialHistoryObservation(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Social History Section Social History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSocialHistorySectionSocialHistoryObservation(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ccd::SocialHistoryObservation))
	 * @param codedSocialHistorySection The receiving '<em><b>Coded Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCodedSocialHistorySectionSocialHistoryObservation(
			CodedSocialHistorySection codedSocialHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_SOCIAL_HISTORY_SECTION__CODED_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION,
					IHEPlugin.INSTANCE.getString("CodedSocialHistorySectionSocialHistoryObservation"),
					new Object[] { codedSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHESocialHistoryObservations(CodedSocialHistorySection) <em>Get IHE Social History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHESocialHistoryObservations(CodedSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::SocialHistoryObservation)).oclAsType(ccd::SocialHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getIHESocialHistoryObservations(CodedSocialHistorySection) <em>Get IHE Social History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHESocialHistoryObservations(CodedSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::SocialHistoryObservation)).oclAsType(ccd::SocialHistoryObservation)
	 * @param codedSocialHistorySection The receiving '<em><b>Coded Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<SocialHistoryObservation> getIHESocialHistoryObservations(
			CodedSocialHistorySection codedSocialHistorySection) {
		if (GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_SOCIAL_HISTORY_SECTION,
				IHEPackage.Literals.CODED_SOCIAL_HISTORY_SECTION.getEAllOperations().get(68));
			try {
				GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SocialHistoryObservation> result = (Collection<SocialHistoryObservation>) query.evaluate(codedSocialHistorySection);
		return new BasicEList.UnmodifiableEList<SocialHistoryObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.16.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(CodedSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.16.1')
	 * @param codedSocialHistorySection The receiving '<em><b>Coded Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTemplateId(CodedSocialHistorySection codedSocialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"SocialHistorySectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									codedSocialHistorySection, context) }), new Object[] { codedSocialHistorySection }));
			}

			return false;
		}
		return true;
	}

} // CodedSocialHistorySectionOperations
