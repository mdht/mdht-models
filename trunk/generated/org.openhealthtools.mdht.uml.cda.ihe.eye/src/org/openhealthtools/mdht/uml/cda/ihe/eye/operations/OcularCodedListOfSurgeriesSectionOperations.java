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

import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSurgeriesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ocular Coded List Of Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection#validateOcularCodedListOfSurgeriesSectionProcedureEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection#validateOcularCodedListOfSurgeriesSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection#getProcedureEntry() <em>Get Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection#getEyeExternalReference() <em>Get Eye External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection#validateCodedSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OcularCodedListOfSurgeriesSectionOperations extends CodedSurgeriesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularCodedListOfSurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section Procedure Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(ihe::ProcedureEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section Procedure Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularCodedListOfSurgeriesSection The receiving '<em><b>Ocular Coded List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularCodedListOfSurgeriesSectionProcedureEntry(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularCodedListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_CODED_LIST_OF_SURGERIES_SECTION__OCULAR_CODED_LIST_OF_SURGERIES_SECTION_PROCEDURE_ENTRY,
						 EyePlugin.INSTANCE.getString("OcularCodedListOfSurgeriesSectionProcedureEntry"),
						 new Object [] { ocularCodedListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(ihe::ExternalReference))";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular Coded List Of Surgeries Section External Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularCodedListOfSurgeriesSection The receiving '<em><b>Ocular Coded List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularCodedListOfSurgeriesSectionExternalReference(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularCodedListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_CODED_LIST_OF_SURGERIES_SECTION__OCULAR_CODED_LIST_OF_SURGERIES_SECTION_EXTERNAL_REFERENCE,
						 EyePlugin.INSTANCE.getString("OcularCodedListOfSurgeriesSectionExternalReference"),
						 new Object [] { ocularCodedListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureEntry(OcularCodedListOfSurgeriesSection) <em>Get Procedure Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntry(OcularCodedListOfSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ENTRY__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(ihe::ProcedureEntry))->asSequence()->any(true).oclAsType(ihe::ProcedureEntry)";

	/**
	 * The cached OCL query for the '{@link #getProcedureEntry(OcularCodedListOfSurgeriesSection) <em>Get Procedure Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureEntry(OcularCodedListOfSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ProcedureEntry getProcedureEntry(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection) {
		if (GET_PROCEDURE_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION, EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION.getEAllOperations().get(68));
			try {
				GET_PROCEDURE_ENTRY__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ENTRY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ENTRY__EOCL_QRY);
		return (ProcedureEntry) query.evaluate(ocularCodedListOfSurgeriesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEyeExternalReference(OcularCodedListOfSurgeriesSection) <em>Get Eye External Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeExternalReference(OcularCodedListOfSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EYE_EXTERNAL_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ihe::ExternalReference))->asSequence()->any(true).oclAsType(ihe::ExternalReference)";

	/**
	 * The cached OCL query for the '{@link #getEyeExternalReference(OcularCodedListOfSurgeriesSection) <em>Get Eye External Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyeExternalReference(OcularCodedListOfSurgeriesSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EYE_EXTERNAL_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExternalReference getEyeExternalReference(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection) {
		if (GET_EYE_EXTERNAL_REFERENCE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION, EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION.getEAllOperations().get(69));
			try {
				GET_EYE_EXTERNAL_REFERENCE__EOCL_QRY = helper.createQuery(GET_EYE_EXTERNAL_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EYE_EXTERNAL_REFERENCE__EOCL_QRY);
		return (ExternalReference) query.evaluate(ocularCodedListOfSurgeriesSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularCodedListOfSurgeriesSection The receiving '<em><b>Ocular Coded List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCodedSurgeriesSectionTemplateId(OcularCodedListOfSurgeriesSection ocularCodedListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_CODED_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularCodedListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_CODED_LIST_OF_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("CodedSurgeriesSectionTemplateId"),
						 new Object [] { ocularCodedListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

} // OcularCodedListOfSurgeriesSectionOperations