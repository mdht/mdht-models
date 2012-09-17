/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Instructions Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#validateMu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#getMu2consolInstructionss() <em>Get Mu2consol Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#validateInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionsSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Instructions Section Instructions</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::Instructions))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Instructions Section Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolInstructionsSectionInstructions(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined()
	 * and entry.act.oclIsKindOf(consol::Instructions))
	 * 
	 * @param instructionsSection
	 *            The receiving '<em><b>Instructions Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolInstructionsSectionInstructions(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.INSTRUCTIONS_SECTION__MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolInstructionsSectionInstructions"),
						 new Object [] { instructionsSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolInstructionss(InstructionsSection) <em>Get Mu2consol Instructionss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolInstructionss(InstructionsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_INSTRUCTIONSS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolInstructionss(InstructionsSection) <em>Get Mu2consol Instructionss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolInstructionss(InstructionsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_INSTRUCTIONSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions)).oclAsType(consol::Instructions)
	 * @param instructionsSection The receiving '<em><b>Instructions Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<Instructions> getMu2consolInstructionss(InstructionsSection instructionsSection) {
		if (GET_MU2CONSOL_INSTRUCTIONSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.INSTRUCTIONS_SECTION, Mu2consolPackage.Literals.INSTRUCTIONS_SECTION.getEAllOperations().get(63));
			try {
				GET_MU2CONSOL_INSTRUCTIONSS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_INSTRUCTIONSS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_INSTRUCTIONSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Instructions> result = (Collection<Instructions>) query.evaluate(instructionsSection);
		return new BasicEList.UnmodifiableEList<Instructions>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Instructions Section Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateInstructionsSectionTemplateId(InstructionsSection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.45')";

	/**
	 * The cached OCL invariant for the '{@link #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateInstructionsSectionTemplateId(InstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * 
	 * @param instructionsSection
	 *            The receiving '<em><b>Instructions Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateInstructionsSectionTemplateId(
			InstructionsSection instructionsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.INSTRUCTIONS_SECTION);
			try {
				VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(instructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.INSTRUCTIONS_SECTION__INSTRUCTIONS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InstructionsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(instructionsSection, context) }),
						 new Object [] { instructionsSection }));
			}
			 
			return false;
		}
		return true;
	}

} // InstructionsSectionOperations