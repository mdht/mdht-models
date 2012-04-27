/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#getInstructionss() <em>Get Instructionss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionsSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected InstructionsSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.45')";

	/**
	* The cached OCL invariant for the '{@link #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.45')
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateInstructionsSectionTemplateId(InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("InstructionsSectionTemplateId"),
					new Object[] { instructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateInstructionsSectionCode(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionCode(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '69730-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateInstructionsSectionCode(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionCode(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	* value.code = '69730-0' and value.codeSystem = '2.16.840.1.113883.6.1')
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateInstructionsSectionCode(InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("InstructionsSectionCode"), new Object[] { instructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateInstructionsSectionText(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionText(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateInstructionsSectionText(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionText(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* not self.text.oclIsUndefined()
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateInstructionsSectionText(InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("InstructionsSectionText"), new Object[] { instructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateInstructionsSectionTitle(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionTitle(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateInstructionsSectionTitle(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionTitle(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateInstructionsSectionTitle(InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("InstructionsSectionTitle"), new Object[] { instructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instructions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions))";

	/**
	* The cached OCL invariant for the '{@link #validateInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instructions</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions))
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateInstructionsSectionInstructions(InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_INSTRUCTIONS,
					ConsolPlugin.INSTANCE.getString("InstructionsSectionInstructions"),
					new Object[] { instructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getInstructionss(InstructionsSection) <em>Get Instructionss</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructionss(InstructionsSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	* The cached OCL query for the '{@link #getInstructionss(InstructionsSection) <em>Get Instructionss</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInstructionss(InstructionsSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONSS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)
	* @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static EList<Instructions> getInstructionss(InstructionsSection instructionsSection) {
		if (GET_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INSTRUCTIONS_SECTION,
				ConsolPackage.Literals.INSTRUCTIONS_SECTION.getEAllOperations().get(60));
			try {
				GET_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(instructionsSection);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

} // InstructionsSectionOperations
