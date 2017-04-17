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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingReferenceOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected TimingReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceTemplateId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceTemplateId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.97')";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceTemplateId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceTemplateId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceTemplateId(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceClassCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceMoodCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceId(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceId(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceCodeP(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TRtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceEffectiveTime(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceText(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceText(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceText(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceText(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceText(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociation(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociation(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociation(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociation(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociation(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(classCode=vocab::x_ActClassDocumentEntryAct::ACT)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePointClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('moodCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePointMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePointCodeP(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePointCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'ATPtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePointCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePointCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationTypeCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationTypeCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationTypeCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationTypeCode(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationTypeCode(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePoint(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePoint(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTimingReferenceAnchorAssociationAnchorTimePoint(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTimingReferenceAnchorAssociationAnchorTimePoint(TimingReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param timingReference The receiving '<em><b>Timing Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTimingReferenceAnchorAssociationAnchorTimePoint(TimingReference timingReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.TIMING_REFERENCE);
			try {
				VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(timingReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.TIMING_REFERENCE__TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TimingReferenceTimingReferenceAnchorAssociationAnchorTimePoint", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(timingReference, context) }),
						 new Object [] { timingReference }));
			}
			 
			return false;
		}
		return true;
	}

} // TimingReferenceOperations