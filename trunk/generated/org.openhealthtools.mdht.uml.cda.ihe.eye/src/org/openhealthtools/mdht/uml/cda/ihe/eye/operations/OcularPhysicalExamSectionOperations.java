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

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.RoutineEyeExamSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.PhysicalExamSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ocular Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection#validateOcularPhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection#validateOcularPhysicalExamSectionRoutineEyeExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Routine Eye Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection#getRoutineEyeExamSection() <em>Get Routine Eye Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularPhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OcularPhysicalExamSectionOperations extends PhysicalExamSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularPhysicalExamSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '70948-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularPhysicalExamSection The receiving '<em><b>Ocular Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularPhysicalExamSectionCode(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularPhysicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_PHYSICAL_EXAM_SECTION__OCULAR_PHYSICAL_EXAM_SECTION_CODE,
						 EyePlugin.INSTANCE.getString("OcularPhysicalExamSectionCode"),
						 new Object [] { ocularPhysicalExamSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Routine Eye Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::RoutineEyeExamSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Physical Exam Section Routine Eye Exam Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularPhysicalExamSection The receiving '<em><b>Ocular Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularPhysicalExamSectionRoutineEyeExamSection(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularPhysicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_PHYSICAL_EXAM_SECTION__OCULAR_PHYSICAL_EXAM_SECTION_ROUTINE_EYE_EXAM_SECTION,
						 EyePlugin.INSTANCE.getString("OcularPhysicalExamSectionRoutineEyeExamSection"),
						 new Object [] { ocularPhysicalExamSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRoutineEyeExamSection(OcularPhysicalExamSection) <em>Get Routine Eye Exam Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineEyeExamSection(OcularPhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ROUTINE_EYE_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::RoutineEyeExamSection))->asSequence()->any(true).oclAsType(eye::RoutineEyeExamSection)";

	/**
	 * The cached OCL query for the '{@link #getRoutineEyeExamSection(OcularPhysicalExamSection) <em>Get Routine Eye Exam Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutineEyeExamSection(OcularPhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ROUTINE_EYE_EXAM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  RoutineEyeExamSection getRoutineEyeExamSection(OcularPhysicalExamSection ocularPhysicalExamSection) {
		if (GET_ROUTINE_EYE_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION, EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION.getEAllOperations().get(110));
			try {
				GET_ROUTINE_EYE_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_ROUTINE_EYE_EXAM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ROUTINE_EYE_EXAM_SECTION__EOCL_QRY);
		return (RoutineEyeExamSection) query.evaluate(ocularPhysicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.5')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularPhysicalExamSection The receiving '<em><b>Ocular Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExamSectionTemplateId(OcularPhysicalExamSection ocularPhysicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularPhysicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("PhysicalExamSectionTemplateId"),
						 new Object [] { ocularPhysicalExamSection }));
			}
			 
			return false;
		}
		return true;
	}

} // OcularPhysicalExamSectionOperations