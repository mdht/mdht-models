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

import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Reported By Dispatch</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch#validateComplaintReportedByDispatchMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintReportedByDispatchOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintReportedByDispatchOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchTemplateId(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchTemplateId(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.74')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchTemplateId(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchTemplateId(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchTemplateId(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchTemplateId"),
						 new Object [] { complaintReportedByDispatch }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchCodeP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchCodeP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchCodeP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchCodeP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchCodeP(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchCodeP"),
						 new Object [] { complaintReportedByDispatch }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatchCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatchCodeP", passToken);
				}
				passToken.add(complaintReportedByDispatch);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67570-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchCode(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatchCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(complaintReportedByDispatch)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchCode"),
						 new Object [] { complaintReportedByDispatch }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchValue(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchValue(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA15468-4' or value.code = 'LA15903-0' or value.code = 'LA17117-5' or value.code = 'LA17118-3' or value.code = 'LA17119-1' or value.code = 'LA17120-9' or value.code = 'LA17121-7' or value.code = 'LA17122-5' or value.code = 'LA17123-3' or value.code = 'LA17124-1' or value.code = 'LA17125-8' or value.code = 'LA17126-6' or value.code = 'LA17127-4' or value.code = 'LA17128-2' or value.code = 'LA17129-0' or value.code = 'LA17131-6' or value.code = 'LA17132-4' or value.code = 'LA17133-2' or value.code = 'LA17134-0' or value.code = 'LA17135-7' or value.code = 'LA17136-5' or value.code = 'LA17137-3' or value.code = 'LA17138-1' or value.code = 'LA17140-7' or value.code = 'LA17141-5' or value.code = 'LA17142-3' or value.code = 'LA17143-1' or value.code = 'LA17144-9' or value.code = 'LA17145-6' or value.code = 'LA17146-4' or value.code = 'LA17147-2' or value.code = 'LA17148-0' or value.code = 'LA17149-8' or value.code = 'LA17150-6' or value.code = 'LA18093-7' or value.code = 'LA18209-9' or value.code = 'LA18210-7' or value.code = 'LA18211-5' or value.code = 'LA9553-4' or value.code = 'LA9555-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchValue(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchValue(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchValue(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchValue"),
						 new Object [] { complaintReportedByDispatch }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchValueP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchValueP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchValueP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchValueP(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchValueP(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchValueP"),
						 new Object [] { complaintReportedByDispatch }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintReportedByDispatchMoodCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchMoodCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintReportedByDispatchMoodCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Reported By Dispatch Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintReportedByDispatchMoodCode(ComplaintReportedByDispatch, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintReportedByDispatch The receiving '<em><b>Complaint Reported By Dispatch</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateComplaintReportedByDispatchMoodCode(ComplaintReportedByDispatch complaintReportedByDispatch, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_REPORTED_BY_DISPATCH);
			try {
				VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(complaintReportedByDispatch)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_REPORTED_BY_DISPATCH__COMPLAINT_REPORTED_BY_DISPATCH_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintReportedByDispatchMoodCode"),
						 new Object [] { complaintReportedByDispatch }));
			}
			 
			return false;
		}
		return true;
	}

} // ComplaintReportedByDispatchOperations