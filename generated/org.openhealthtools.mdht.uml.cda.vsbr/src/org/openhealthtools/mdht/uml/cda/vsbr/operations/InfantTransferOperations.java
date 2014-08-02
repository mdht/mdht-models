/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPlugin;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Transfer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer#validateInfantTransferParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfantTransferOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfantTransferOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferTemplateId(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferTemplateId(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.29')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferTemplateId(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferTemplateId(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferTemplateId(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_TEMPLATE_ID,
					VsbrPlugin.INSTANCE.getString("InfantTransferTemplateId"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferClassCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferClassCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferClassCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferClassCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferClassCode(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_CLASS_CODE,
					VsbrPlugin.INSTANCE.getString("InfantTransferClassCode"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferMoodCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferMoodCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferMoodCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferMoodCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferMoodCode(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_MOOD_CODE,
					VsbrPlugin.INSTANCE.getString("InfantTransferMoodCode"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferCodeP(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferCodeP(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferCodeP(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferCodeP(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferCodeP(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_CODE_P,
					VsbrPlugin.INSTANCE.getString("InfantTransferCodeP"), new Object[] { infantTransfer }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.vsbr.InfantTransferCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.vsbr.InfantTransferCodeP", passToken);
				}
				passToken.add(infantTransfer);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73758-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferCode(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferCode(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.vsbr.InfantTransferCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(infantTransfer)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_CODE,
					VsbrPlugin.INSTANCE.getString("InfantTransferCode"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferValue(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferValue(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferValue(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferValue(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferValue(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_VALUE,
					VsbrPlugin.INSTANCE.getString("InfantTransferValue"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfantTransferParticipant(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferParticipant(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfantTransferParticipant(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Transfer Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfantTransferParticipant(InfantTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param infantTransfer The receiving '<em><b>Infant Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInfantTransferParticipant(InfantTransfer infantTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.INFANT_TRANSFER);
			try {
				VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFANT_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			infantTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.INFANT_TRANSFER__INFANT_TRANSFER_PARTICIPANT,
					VsbrPlugin.INSTANCE.getString("InfantTransferParticipant"), new Object[] { infantTransfer }));
			}

			return false;
		}
		return true;
	}

} // InfantTransferOperations
