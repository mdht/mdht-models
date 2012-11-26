/*******************************************************************************
 * Copyright (c) 2011, 2012 David A. Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainFactory;
import org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IComment;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IFamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IGeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IPatientSummary;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/apitest/domain");
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainPackage.ISTATUS_OBSERVATION:
				return (EObject) createIStatusObservation();
			case DomainPackage.ICONDITION:
				return (EObject) createICondition();
			case DomainPackage.IEPISODE_OBSERVATION:
				return (EObject) createIEpisodeObservation();
			case DomainPackage.IPROBLEM_ENTRY:
				return (EObject) createIProblemEntry();
			case DomainPackage.IAGE_OBSERVATION:
				return (EObject) createIAgeObservation();
			case DomainPackage.ISEVERITY:
				return (EObject) createISeverity();
			case DomainPackage.IPROBLEM_STATUS_OBSERVATION:
				return (EObject) createIProblemStatusObservation();
			case DomainPackage.IHEALTH_STATUS_OBSERVATION:
				return (EObject) createIHealthStatusObservation();
			case DomainPackage.ICOMMENT:
				return (EObject) createIComment();
			case DomainPackage.ICAUSE_OF_DEATH_OBSERVATION:
				return (EObject) createICauseOfDeathObservation();
			case DomainPackage.IFAMILY_HISTORY_OBSERVATION:
				return (EObject) createIFamilyHistoryObservation();
			case DomainPackage.ITREATING_PROVIDER:
				return (EObject) createITreatingProvider();
			case DomainPackage.IPROBLEM_LIST_SECTION:
				return (EObject) createIProblemListSection();
			case DomainPackage.IPATIENT_SUMMARY:
				return (EObject) createIPatientSummary();
			case DomainPackage.IGENERAL_HEADER_CONSTRAINTS:
				return (EObject) createIGeneralHeaderConstraints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatusObservation createIStatusObservation() {
		IStatusObservationImpl iStatusObservation = new IStatusObservationImpl();
		return iStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition createICondition() {
		IConditionImpl iCondition = new IConditionImpl();
		return iCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEpisodeObservation createIEpisodeObservation() {
		IEpisodeObservationImpl iEpisodeObservation = new IEpisodeObservationImpl();
		return iEpisodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry createIProblemEntry() {
		IProblemEntryImpl iProblemEntry = new IProblemEntryImpl();
		return iProblemEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation createIAgeObservation() {
		IAgeObservationImpl iAgeObservation = new IAgeObservationImpl();
		return iAgeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity createISeverity() {
		ISeverityImpl iSeverity = new ISeverityImpl();
		return iSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation createIProblemStatusObservation() {
		IProblemStatusObservationImpl iProblemStatusObservation = new IProblemStatusObservationImpl();
		return iProblemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation createIHealthStatusObservation() {
		IHealthStatusObservationImpl iHealthStatusObservation = new IHealthStatusObservationImpl();
		return iHealthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment createIComment() {
		ICommentImpl iComment = new ICommentImpl();
		return iComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation createICauseOfDeathObservation() {
		ICauseOfDeathObservationImpl iCauseOfDeathObservation = new ICauseOfDeathObservationImpl();
		return iCauseOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryObservation createIFamilyHistoryObservation() {
		IFamilyHistoryObservationImpl iFamilyHistoryObservation = new IFamilyHistoryObservationImpl();
		return iFamilyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITreatingProvider createITreatingProvider() {
		ITreatingProviderImpl iTreatingProvider = new ITreatingProviderImpl();
		return iTreatingProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection createIProblemListSection() {
		IProblemListSectionImpl iProblemListSection = new IProblemListSectionImpl();
		return iProblemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientSummary createIPatientSummary() {
		IPatientSummaryImpl iPatientSummary = new IPatientSummaryImpl();
		return iPatientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralHeaderConstraints createIGeneralHeaderConstraints() {
		IGeneralHeaderConstraintsImpl iGeneralHeaderConstraints = new IGeneralHeaderConstraintsImpl();
		return iGeneralHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} // DomainFactoryImpl
