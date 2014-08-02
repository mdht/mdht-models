/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Transfer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer#validateMaternalTransferParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaternalTransferOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaternalTransferOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferTemplateId(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferTemplateId(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.35')";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferTemplateId(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferTemplateId(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferTemplateId(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferClassCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferClassCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferClassCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferClassCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferClassCode(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferMoodCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferMoodCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferMoodCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferMoodCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferMoodCode(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferCodeP(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferCodeP(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferCodeP(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferCodeP(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferCodeP(MaternalTransfer maternalTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '73763-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferCode(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferCode(MaternalTransfer maternalTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferValue(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferValue(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferValue(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferValue(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferValue(MaternalTransfer maternalTransfer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_VALUE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferValue",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMaternalTransferParticipant(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferParticipant(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateMaternalTransferParticipant(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Transfer Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMaternalTransferParticipant(MaternalTransfer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param maternalTransfer The receiving '<em><b>Maternal Transfer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMaternalTransferParticipant(MaternalTransfer maternalTransfer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.MATERNAL_TRANSFER);
			try {
				VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MATERNAL_TRANSFER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			maternalTransfer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.MATERNAL_TRANSFER__MATERNAL_TRANSFER_PARTICIPANT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"MaternalTransferParticipant",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(maternalTransfer, context) }),
					new Object[] { maternalTransfer }));
			}

			return false;
		}
		return true;
	}

} // MaternalTransferOperations
