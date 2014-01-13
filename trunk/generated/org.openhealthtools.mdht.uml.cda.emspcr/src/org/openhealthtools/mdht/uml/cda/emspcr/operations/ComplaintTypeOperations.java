/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType#validateComplaintTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintTypeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintTypeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeTemplateId(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeTemplateId(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.138')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeTemplateId(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeTemplateId(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeTemplateId(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeTemplateId"),
						 new Object [] { complaintType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeMoodCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeMoodCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeMoodCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeMoodCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeMoodCode(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeMoodCode"),
						 new Object [] { complaintType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeCodeP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeCodeP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeCodeP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeCodeP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeCodeP(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeCodeP"),
						 new Object [] { complaintType }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintTypeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintTypeCodeP", passToken);
				}
				passToken.add(complaintType);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '72114-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeCode(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeCode(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintTypeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(complaintType)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeCode"),
						 new Object [] { complaintType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeValue(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeValue(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17059-9' or value.code = 'LA18923-5' or value.code = 'LA18924-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeValue(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeValue(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeValue(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeValue"),
						 new Object [] { complaintType }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintTypeValueP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeValueP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintTypeValueP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Type Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintTypeValueP(ComplaintType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintType The receiving '<em><b>Complaint Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintTypeValueP(ComplaintType complaintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_TYPE);
			try {
				VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintType)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_TYPE__COMPLAINT_TYPE_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintTypeValueP"),
						 new Object [] { complaintType }));
			}
			 
			return false;
		}
		return true;
	}

} // ComplaintTypeOperations