/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Positionof Subject</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject#validatePositionofSubjectValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionofSubjectOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected PositionofSubjectOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectTemplateId(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectTemplateId(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.69')";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectTemplateId(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectTemplateId(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectTemplateId(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectClassCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectClassCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectClassCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectClassCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectClassCode(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectMoodCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectMoodCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectMoodCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectMoodCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectMoodCode(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectCodeP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectCodeP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectCodeP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectCodeP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectCodeP(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C71148' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectCode(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectCode(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectValue(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectValue(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectValue(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectValue(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectValue(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePositionofSubjectValueP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectValueP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePositionofSubjectValueP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Positionof Subject Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePositionofSubjectValueP(PositionofSubject, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param positionofSubject The receiving '<em><b>Positionof Subject</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePositionofSubjectValueP(PositionofSubject positionofSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.POSITIONOF_SUBJECT);
			try {
				VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_POSITIONOF_SUBJECT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(positionofSubject)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.POSITIONOF_SUBJECT__POSITIONOF_SUBJECT_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PositionofSubjectPositionofSubjectValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(positionofSubject, context) }),
						 new Object [] { positionofSubject }));
			}
			 
			return false;
		}
		return true;
	}

} // PositionofSubjectOperations