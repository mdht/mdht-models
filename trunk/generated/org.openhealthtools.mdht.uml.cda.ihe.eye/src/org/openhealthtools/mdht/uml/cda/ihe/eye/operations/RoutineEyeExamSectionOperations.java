/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.RoutineEyeExamSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.EyesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Routine Eye Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.RoutineEyeExamSection#validateEyesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eyes Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutineEyeExamSectionOperations extends EyesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutineEyeExamSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEyesSectionTemplateId(RoutineEyeExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eyes Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEyesSectionTemplateId(RoutineEyeExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateEyesSectionTemplateId(RoutineEyeExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eyes Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEyesSectionTemplateId(RoutineEyeExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param routineEyeExamSection The receiving '<em><b>Routine Eye Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateEyesSectionTemplateId(RoutineEyeExamSection routineEyeExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.ROUTINE_EYE_EXAM_SECTION);
			try {
				VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EYES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(routineEyeExamSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.ROUTINE_EYE_EXAM_SECTION__EYES_SECTION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("EyesSectionTemplateId"),
						 new Object [] { routineEyeExamSection }));
			}
			 
			return false;
		}
		return true;
	}

} // RoutineEyeExamSectionOperations