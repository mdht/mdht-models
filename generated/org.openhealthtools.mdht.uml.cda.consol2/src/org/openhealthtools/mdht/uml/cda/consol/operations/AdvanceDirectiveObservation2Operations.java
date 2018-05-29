/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservation2Operations extends AdvanceDirectiveObservationOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservation2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2TemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2TemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.48' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2TemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2TemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservation2TemplateId(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservation2TemplateId"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2Value(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2Value(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2Value(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2Value(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservation2Value(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservation2Value"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2AuthorParticipation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2AuthorParticipation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2AuthorParticipation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2AuthorParticipation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservation2AuthorParticipation(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservation2AuthorParticipation"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CDTranslation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CDTranslation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.code = '75320-2' and value.codeSystem = '2.16.840.1.113883.6.1')) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CDTranslation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CDTranslation(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CDTranslation(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CDTranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CDTranslationP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CDTranslationP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CDTranslationP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CDTranslationP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CDTranslationP(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CDTranslationP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2IVLTSLow(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2IVLTSLow(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2IVLTSLow(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2IVLTSLow(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2IVLTSLow(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2IVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2IVLTSHigh(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2IVLTSHigh(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2IVLTSHigh(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2IVLTSHigh(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2IVLTSHigh(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierParticipantRoleCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2VerifierParticipantRoleCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2VerifierParticipantRoleCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2VerifierParticipantRoleCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierParticipantRoleCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierParticipantRoleAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2VerifierTemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierTemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->select(typeCode=vocab::ParticipationType::VRF)->reject(templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.58'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2VerifierTemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2VerifierTemplateId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2VerifierTemplateId(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_TEMPLATE_ID,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2VerifierTemplateId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '63161005' or value.code = '2603003')))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CustodianCustodianRoleCodeP"),
							new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2CustodianCustodianRoleCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2CustodianCustodianRoleCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Media Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject(not text.mediaType.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Media Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject(not text.oclIsUndefined() implies not text.reference.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Reference Advance Directive Observation Reference External Document Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_REFERENCE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference External Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference External Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasStartingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationHasStartingTime(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationHasStartingTime"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime.high.hasContent() or self.effectiveTime.high.nullFlavor = vocab::NullFlavor::NA";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationHasEndingTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationHasEndingTime(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationHasEndingTime"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCodeP(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationCodeP(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservation2AdvanceDirectiveObservationCodeP"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP", passToken);
				}
				passToken.add(advanceDirectiveObservation2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '52765003' or value.code = '61420007' or value.code = '71388002' or value.code = '78823007' or value.code = '89666000' or value.code = '225204009' or value.code = '281789004' or value.code = '304251008'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationCode(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(advanceDirectiveObservation2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("AdvanceDirectiveObservation2AdvanceDirectiveObservationCode"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationEffectiveTime(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationEffectiveTime"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::VRF)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifier(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationVerifier(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationVerifier"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::CST)->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodian(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationCustodian(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodian"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReference(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveObservationReference(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveObservation2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveObservation2AdvanceDirectiveObservationReference"),
						new Object[] { advanceDirectiveObservation2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->select(typeCode=vocab::ParticipationType::VRF)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierTime(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationVerifierTime(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->select(typeCode=vocab::ParticipationType::VRF)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationVerifierParticipantRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationVerifierParticipantRole(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() =  1))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianCustodianRoleAddr"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (( not telecom->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianCustodianRoleTelecom"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST)->select(typeCode=vocab::ParticipationType::CST)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationReferenceExternalDocumentId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceExternalDocumentId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationReferenceExternalDocumentId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceExternalDocumentId(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationReferenceExternalDocumentText(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceExternalDocumentText(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null).externalDocument->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationReferenceExternalDocumentText(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceExternalDocumentText(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentText"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveObservationReferenceTypeCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceTypeCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipExternalReference) and " +
			"let value : vocab::x_ActRelationshipExternalReference = typeCode.oclAsType(vocab::x_ActRelationshipExternalReference) in " +
			"value = vocab::x_ActRelationshipExternalReference::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveObservationReferenceTypeCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveObservationReferenceTypeCode(AdvanceDirectiveObservation2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveObservation2 The receiving '<em><b>Advance Directive Observation2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceDirectiveObservationReferenceTypeCode(
			AdvanceDirectiveObservation2 advanceDirectiveObservation2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceDirectiveObservation2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_DIRECTIVE_OBSERVATION2__ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // AdvanceDirectiveObservation2Operations
