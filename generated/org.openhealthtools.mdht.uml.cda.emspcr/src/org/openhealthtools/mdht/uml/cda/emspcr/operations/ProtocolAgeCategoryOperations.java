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
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Age Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolAgeCategoryOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected ProtocolAgeCategoryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryTemplateId(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryTemplateId(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.149')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryTemplateId(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryTemplateId(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryTemplateId(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryTemplateId"),
						 new Object [] { protocolAgeCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryMoodCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryMoodCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryMoodCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryMoodCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryMoodCode(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryMoodCode"),
						 new Object [] { protocolAgeCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryCodeP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryCodeP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryCodeP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryCodeP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryCodeP(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryCodeP"),
						 new Object [] { protocolAgeCategory }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategoryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategoryCodeP", passToken);
				}
				passToken.add(protocolAgeCategory);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67538-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryCode(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryCode(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategoryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(protocolAgeCategory)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_CODE,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryCode"),
						 new Object [] { protocolAgeCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryValue(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryValue(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17571-3' or value.code = 'LA17572-1' or value.code = 'LA17573-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryValue(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryValue(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryValue(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryValue"),
						 new Object [] { protocolAgeCategory }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProtocolAgeCategoryValueP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryValueP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProtocolAgeCategoryValueP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProtocolAgeCategoryValueP(ProtocolAgeCategory, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param protocolAgeCategory The receiving '<em><b>Protocol Age Category</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProtocolAgeCategoryValueP(ProtocolAgeCategory protocolAgeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY);
			try {
				VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(protocolAgeCategory)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PROTOCOL_AGE_CATEGORY__PROTOCOL_AGE_CATEGORY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("ProtocolAgeCategoryProtocolAgeCategoryValueP"),
						 new Object [] { protocolAgeCategory }));
			}
			 
			return false;
		}
		return true;
	}

} // ProtocolAgeCategoryOperations
