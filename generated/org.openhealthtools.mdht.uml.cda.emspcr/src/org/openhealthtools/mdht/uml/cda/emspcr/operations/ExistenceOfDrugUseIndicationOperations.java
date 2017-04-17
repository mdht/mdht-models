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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Drug Use Indication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication#validateExistenceOfDrugUseIndicationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistenceOfDrugUseIndicationOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ExistenceOfDrugUseIndicationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugUseIndicationTemplateId(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationTemplateId(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.70')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugUseIndicationTemplateId(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationTemplateId(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugUseIndication The receiving '<em><b>Existence Of Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfDrugUseIndicationTemplateId(
			ExistenceOfDrugUseIndication existenceOfDrugUseIndication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfDrugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_USE_INDICATION__EXISTENCE_OF_DRUG_USE_INDICATION_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugUseIndicationExistenceOfDrugUseIndicationTemplateId"),
						 new Object [] { existenceOfDrugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugUseIndicationMoodCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationMoodCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugUseIndicationMoodCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationMoodCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugUseIndication The receiving '<em><b>Existence Of Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfDrugUseIndicationMoodCode(
			ExistenceOfDrugUseIndication existenceOfDrugUseIndication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfDrugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_USE_INDICATION__EXISTENCE_OF_DRUG_USE_INDICATION_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugUseIndicationExistenceOfDrugUseIndicationMoodCode"),
						 new Object [] { existenceOfDrugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugUseIndicationCodeP(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationCodeP(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugUseIndicationCodeP(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationCodeP(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugUseIndication The receiving '<em><b>Existence Of Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfDrugUseIndicationCodeP(
			ExistenceOfDrugUseIndication existenceOfDrugUseIndication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfDrugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_USE_INDICATION__EXISTENCE_OF_DRUG_USE_INDICATION_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugUseIndicationExistenceOfDrugUseIndicationCodeP"),
						 new Object [] { existenceOfDrugUseIndication }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndicationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndicationCodeP", passToken);
				}
				passToken.add(existenceOfDrugUseIndication);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugUseIndicationCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69757-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugUseIndicationCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationCode(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugUseIndication The receiving '<em><b>Existence Of Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfDrugUseIndicationCode(
			ExistenceOfDrugUseIndication existenceOfDrugUseIndication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndicationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(existenceOfDrugUseIndication)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfDrugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_USE_INDICATION__EXISTENCE_OF_DRUG_USE_INDICATION_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugUseIndicationExistenceOfDrugUseIndicationCode"),
						 new Object [] { existenceOfDrugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExistenceOfDrugUseIndicationValue(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationValue(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateExistenceOfDrugUseIndicationValue(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Drug Use Indication Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExistenceOfDrugUseIndicationValue(ExistenceOfDrugUseIndication, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param existenceOfDrugUseIndication The receiving '<em><b>Existence Of Drug Use Indication</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateExistenceOfDrugUseIndicationValue(
			ExistenceOfDrugUseIndication existenceOfDrugUseIndication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXISTENCE_OF_DRUG_USE_INDICATION);
			try {
				VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_EXISTENCE_OF_DRUG_USE_INDICATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(existenceOfDrugUseIndication)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXISTENCE_OF_DRUG_USE_INDICATION__EXISTENCE_OF_DRUG_USE_INDICATION_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExistenceOfDrugUseIndicationExistenceOfDrugUseIndicationValue"),
						 new Object [] { existenceOfDrugUseIndication }));
			}
			 
			return false;
		}
		return true;
	}

} // ExistenceOfDrugUseIndicationOperations
