/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionsOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsTextReference(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTextReference(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined() implies not self.text.reference.value.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsTextReference(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTextReference(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined() implies not self.text.reference.value.oclIsUndefined()
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsTextReference(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_TEXT_REFERENCE,
					ConsolPlugin.INSTANCE.getString("InstructionsTextReference"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsTextReferenceValue(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTextReferenceValue(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsTextReferenceValue(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTextReferenceValue(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.getSection().text.getText(self.text.reference.value.substring(2, self.text.reference.value.size())).oclIsUndefined()
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsTextReferenceValue(Instructions instructions,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_TEXT_REFERENCE_VALUE,
					ConsolPlugin.INSTANCE.getString("InstructionsTextReferenceValue"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsTemplateId(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTemplateId(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsTemplateId(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsTemplateId(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.20')
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsTemplateId(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("InstructionsTemplateId"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsClassCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsClassCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsClassCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsClassCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsClassCode(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("InstructionsClassCode"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsMoodCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsMoodCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsMoodCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsMoodCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::INT
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsMoodCode(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("InstructionsMoodCode"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined())
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateInstructionsCode(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_CODE,
					ConsolPlugin.INSTANCE.getString("InstructionsCode"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsText(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsText(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsText(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsText(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsText(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_TEXT,
					ConsolPlugin.INSTANCE.getString("InstructionsText"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInstructionsStatusCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsStatusCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsStatusCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInstructionsStatusCode(Instructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param instructions The receiving '<em><b>Instructions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInstructionsStatusCode(Instructions instructions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS);
			try {
				VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructions)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS__INSTRUCTIONS_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("InstructionsStatusCode"), new Object[] { instructions }));
			}

			return false;
		}
		return true;
	}

} // InstructionsOperations
