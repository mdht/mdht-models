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
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Secondary Impressions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProviderSecondaryImpressionsOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ProviderSecondaryImpressionsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsTemplateId(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsTemplateId(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.68')";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsTemplateId(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsTemplateId(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsTemplateId(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsTemplateId"),
						 new Object [] { providerSecondaryImpressions }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsMoodCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsMoodCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsMoodCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsMoodCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsMoodCode(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsMoodCode"),
						 new Object [] { providerSecondaryImpressions }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsCodeP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsCodeP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsCodeP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsCodeP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsCodeP(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsCodeP"),
						 new Object [] { providerSecondaryImpressions }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressionsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressionsCodeP", passToken);
				}
				passToken.add(providerSecondaryImpressions);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69542-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsCode(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsCode(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressionsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(providerSecondaryImpressions)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsCode"),
						 new Object [] { providerSecondaryImpressions }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsValue(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsValue(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsValue(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsValue(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsValue(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsValue"),
						 new Object [] { providerSecondaryImpressions }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProviderSecondaryImpressionsValueP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsValueP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProviderSecondaryImpressionsValueP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProviderSecondaryImpressionsValueP(ProviderSecondaryImpressions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param providerSecondaryImpressions The receiving '<em><b>Provider Secondary Impressions</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProviderSecondaryImpressionsValueP(
			ProviderSecondaryImpressions providerSecondaryImpressions, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROVIDER_SECONDARY_IMPRESSIONS);
			try {
				VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(providerSecondaryImpressions)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROVIDER_SECONDARY_IMPRESSIONS__PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ProviderSecondaryImpressionsProviderSecondaryImpressionsValueP"),
						 new Object [] { providerSecondaryImpressions }));
			}
			 
			return false;
		}
		return true;
	}

} // ProviderSecondaryImpressionsOperations
