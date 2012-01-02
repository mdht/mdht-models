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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note Fluid Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperativeNoteFluidSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteFluidSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOperativeNoteFluidSectionTemplateId(OperativeNoteFluidSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.7.12')
	 * @param operativeNoteFluidSection The receiving '<em><b>Operative Note Fluid Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperativeNoteFluidSectionTemplateId(
			OperativeNoteFluidSection operativeNoteFluidSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.OPERATIVE_NOTE_FLUID_SECTION);
			try {
				VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			operativeNoteFluidSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.OPERATIVE_NOTE_FLUID_SECTION__OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("OperativeNoteFluidSectionTemplateId"),
					new Object[] { operativeNoteFluidSection }));
			}
			return false;
		}
		return true;
	}

} // OperativeNoteFluidSectionOperations
