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
import org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Complaint Organ System</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem#validateComplaintOrganSystemValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplaintOrganSystemOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintOrganSystemOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemTemplateId(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemTemplateId(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.140')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemTemplateId(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemTemplateId(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemTemplateId(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemTemplateId"),
						 new Object [] { complaintOrganSystem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemMoodCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemMoodCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemMoodCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemMoodCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemMoodCode(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemMoodCode"),
						 new Object [] { complaintOrganSystem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemCodeP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemCodeP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemCodeP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemCodeP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemCodeP(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemCodeP"),
						 new Object [] { complaintOrganSystem }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystemCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystemCodeP", passToken);
				}
				passToken.add(complaintOrganSystem);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69468-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemCode(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemCode(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystemCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(complaintOrganSystem)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_CODE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemCode"),
						 new Object [] { complaintOrganSystem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemValue(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemValue(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA16968-2' or value.code = 'LA18114-1' or value.code = 'LA18277-6' or value.code = 'LA18278-4' or value.code = 'LA18279-2' or value.code = 'LA18281-8' or value.code = 'LA18282-6' or value.code = 'LA18283-4' or value.code = 'LA18284-2' or value.code = 'LA18285-9' or value.code = 'LA9534-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemValue(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemValue(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemValue(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemValue"),
						 new Object [] { complaintOrganSystem }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateComplaintOrganSystemValueP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemValueP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateComplaintOrganSystemValueP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Complaint Organ System Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateComplaintOrganSystemValueP(ComplaintOrganSystem, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param complaintOrganSystem The receiving '<em><b>Complaint Organ System</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateComplaintOrganSystemValueP(ComplaintOrganSystem complaintOrganSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.COMPLAINT_ORGAN_SYSTEM);
			try {
				VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COMPLAINT_ORGAN_SYSTEM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(complaintOrganSystem)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.COMPLAINT_ORGAN_SYSTEM__COMPLAINT_ORGAN_SYSTEM_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ComplaintOrganSystemComplaintOrganSystemValueP"),
						 new Object [] { complaintOrganSystem }));
			}
			 
			return false;
		}
		return true;
	}

} // ComplaintOrganSystemOperations
